package org.argennon.argcc;


import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.argennon.argcc.parser.ArgCBaseListener;
import org.argennon.argcc.parser.ArgCLexer;
import org.argennon.argcc.parser.ArgCParser;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Transcoder {
    private final MessageReporter reporter;

    public Transcoder(MessageReporter reporter) {
        this.reporter = reporter;
    }

    public boolean compileFiles(File[] files) throws IOException {
        Map<String, ParseTree> trees = new HashMap<>();
        for (var file : files) {
            reporter.generalMessage("Parsing " + file + "...");

            // create a lexer that feeds off of input CharStream
            var lexer = new ArgCLexer(CharStreams.fromPath(file.toPath()));

            // create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // create a parser that feeds off the tokens buffer
            var parser = new ArgCParser(tokens);

            // begin parsing at initial rule and store the generated parse tree.
            trees.put(file.getName(), parser.compilationUnit());
        }

        // pass 1: find all defined types
        reporter.generalMessage("Compiling...");
        for (String fileName : trees.keySet()) {
            reporter.changeCurrentFile(fileName);
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new Generator(), trees.get(fileName));       // walk parse tree
        }
/*
        // pass 2: complete class definitions and find all members
        for (String fileName : trees.keySet()) {
            semanticAnalyzer.setFile(fileName);
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new ClassAllocator(semanticAnalyzer), trees.get(fileName));    // walk parse tree
        }

        // pass 3: generate code
        reporter.generalMessage("Semantic Analysis...");
        for (String fileName : trees.keySet()) {
            semanticAnalyzer.setFile(fileName);
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new CodeGenerator(semanticAnalyzer), trees.get(fileName));     // walk parse tree
        }*/
        return !reporter.errorOccurred();
    }
}

//TODO: use visitor instead of listener to prune the tree
class Generator extends ArgCBaseListener {
    @Override
    public void exitTranslationUnit(ArgCParser.TranslationUnitContext ctx) {
        System.out.println(ctx.getText());
    }
}
