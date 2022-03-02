import org.argennon.argcc.Transcoder;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String workingFolderName = "files";
        if (args.length > 0) workingFolderName = args[0];

        var reporter = new StringBasedReporter();
        Transcoder tc = new Transcoder(reporter);
        File workingFolder = new File(workingFolderName);
        File[] files = workingFolder.listFiles();
        if (files != null) {
            tc.compileFiles(files);
        }
        System.err.println(reporter.getErrorMessages());
    }
}