import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PracticeFileSystem {

    public static void main (String [] args) {
        newFile();
    } // main class end
    static void newFile() {

        String directory = "data";
        String filename = "info.txt";

        Path dataDirectory = Paths.get(directory);
        System.out.println(dataDirectory.toAbsolutePath());
        Path dataFile = Paths.get(directory, filename);

        try {
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }

            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } // try - catch end

    } // new file end


} // public class end
