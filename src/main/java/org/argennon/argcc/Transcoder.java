package org.argennon.argcc;


import org.antlr.v4.runtime.*;
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
            parser.compilationUnit();

            writer.println("#include \"argc/types.h\"");
            writer.println("#include \"argc/functions.h\"");
            writer.println("using namespace argennon; using namespace ascee; using namespace argc;");
            writer.printf("#include \"%s\"", input.getName());
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
