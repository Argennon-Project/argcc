package org.argennon.argcc;


import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.argennon.argcc.parser.ArgCBaseListener;
import org.argennon.argcc.parser.ArgCLexer;
import org.argennon.argcc.parser.ArgCParser;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Transcoder {
    private final MessageReporter reporter;

    public Transcoder(MessageReporter reporter) {
        this.reporter = reporter;
    }

    public boolean transcodeFile(File input, File output) throws IOException {
        reporter.generalMessage("Parsing " + input + "...");
        try (PrintWriter writer = new PrintWriter(output)) {
            // create a lexer that feeds off of input CharStream
            var lexer = new ArgCLexer(CharStreams.fromPath(input.toPath()));
            lexer.addErrorListener(new ErrorTerminator());

            // create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // create a parser that feeds off the tokens buffer
            var parser = new ArgCParser(tokens);
            parser.addErrorListener(new ErrorTerminator());

            // begin parsing at initial rule and store the generated parse tree.
            var tree = parser.compilationUnit();

            ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
            var inserter = new InsertNameSpaceListener(tokens);
            walker.walk(inserter, tree); // initiate walk of tree with listener

            writer.println("#include \"argc/types.h\"");
            writer.println("#include \"argc/functions.h\"");
            writer.println("namespace argennon::ascee::argc {");
            // print back ALTERED stream
            writer.println(inserter.rewriter.getText());
            writer.println("}");

            return true;
        } catch (RuntimeException err) {
            System.err.println(err.getMessage() + ".");
            return false;
        }
    }
}

class ErrorTerminator extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
                            int charPositionInLine, String msg, RecognitionException e) {
        throw new RuntimeException("syntax or lexical error");
    }
}

class InsertNameSpaceListener extends ArgCBaseListener {
    public static final String NAMESPACE = "argc::";
    public static final String VAR_PREFIX = "argc_0_";
    public static final String STRING_CLASS = "string_view_c";
    TokenStreamRewriter rewriter;

    public InsertNameSpaceListener(TokenStream tokens) {
        rewriter = new TokenStreamRewriter(tokens);
    }

    @Override
    public void enterFunctionCall(ArgCParser.FunctionCallContext ctx) {
        rewriter.insertBefore(ctx.start, NAMESPACE);
    }

    @Override
    public void enterVariableDeclarator(ArgCParser.VariableDeclaratorContext ctx) {
        rewriter.insertBefore(ctx.start, VAR_PREFIX);
    }

    @Override
    public void enterVariableUsage(ArgCParser.VariableUsageContext ctx) {
        rewriter.insertBefore(ctx.start, VAR_PREFIX);
    }

    @Override
    public void exitStringLiteral(ArgCParser.StringLiteralContext ctx) {
        rewriter.replace(ctx.start, ctx.stop, STRING_CLASS + "(" + ctx.getText() + ")");
    }
}
