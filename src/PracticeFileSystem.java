import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.*;
import java.util.*;

public class PracticeFileSystem {

    public static void main (String [] args) {

        newFile();
        writeFile();
//        readFile();
//        readWriteFile();

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
        } // try - catch block

    } // new file end

    static void writeFile() {
        List<String> fruit = new ArrayList<>();
        fruit.add("banana"); fruit.add("orange"); fruit.add("peach"); fruit.add("pineapple");
        try {
            Path groceries = Paths.get("data", "groceries.txt");
            Files.write(groceries, fruit);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } // try-catch block

    } // write file end

    static void readFile() {

        try {
            Path poemFile = Paths.get("europa", "poem.txt");
            List<String> poemLines = Files.readAllLines(poemFile);
            for (String line : poemLines) {
                System.out.println(line);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

    static void readWriteFile() {
        List <String> fruit = new ArrayList<>();
        try {
            Path groceries = Paths.get("data", "groceries.txt");
            fruit = Files.readAllLines(groceries);
            for (String line : fruit) {
                System.out.println(line);
            }
        } catch (IOException ioe){
            ioe.printStackTrace();
        }

        fruit.add("kiwi"); fruit.add("star fruit");
        try {
            Path groceries = Paths.get("data", "groceries.txt");
            Files.write(groceries, fruit);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

} // public class end
