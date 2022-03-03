package org.argennon.argcc;


import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
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

            // create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // create a parser that feeds off the tokens buffer
            var parser = new ArgCParser(tokens);

            // begin parsing at initial rule and store the generated parse tree.
            var root = parser.compilationUnit();

            if (parser.getNumberOfSyntaxErrors() != 0) return false;

            writer.println("#include \"argc/types.h\"");
            writer.println("#include \"argc/functions.h\"");
            writer.println("using namespace argennon; using namespace ascee; using namespace argc;");
            writer.printf("#include \"%s\"", input.getName());
            return true;
        }
    }
}
