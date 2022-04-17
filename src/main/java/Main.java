import org.argennon.argcc.Transcoder;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    static final String CMD_FORMAT = "g++ -O3 -Wall -Wconversion -Warray-bounds -Wno-unused -Werror -std=c++2a %s -fPIC -shared -o %s %s";

    public static void main(String[] args) throws IOException {
        String includePath = args[0];
        String srcFileName = args[1];
        String libFileName = args[2];

        var reporter = new StringBasedReporter();
        Transcoder transcoder = new Transcoder(reporter);
        File src = new File(srcFileName);
        System.out.println(src.getName());
        File cppFile = new File(src.getPath() + ".cpp");
        // cppFile.deleteOnExit();
        if (transcoder.transcodeFile(src, cppFile)) {
            String cmd = String.format(CMD_FORMAT, includePath, libFileName, cppFile);
            System.out.println(cmd);
            var process = Runtime.getRuntime().exec(cmd);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.err.println(line);
            }
        }
    }
}