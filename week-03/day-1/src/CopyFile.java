// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {

    public static void main(String[]args) {
        Copying("our-file.txt", "your-file.txt");

    }
    public static boolean Copying (String from, String to) {
        Path sourceFilePath = Paths.get(from);
        Path newFilePath = Paths.get(to);

        try {
            Files.copy(sourceFilePath, newFilePath);
            System.out.println("Done");
            return true;
        } catch (IOException e) {
            System.out.println("Not done");
            return false;
        }
    }
}
