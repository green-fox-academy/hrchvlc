// Create a function that takes 3 parameters: a path, a word and a number
// and is able to write into a file.
// The path parameter should be a string that describes the location of the file you wish to modify
// The word parameter should also be a string that will be written to the file as individual lines
// The number parameter should describe how many lines the file should have.
// If the word is 'apple' and the number is 5, it should write 5 lines
// into the file and each line should read 'apple'
// The function should not raise any errors if it could not write the file.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[]args) {
    writeToFile("my-file.txt", "apple", 5);
    }
    public static void writeToFile (String path, String word, int numberOfLines) {

        List<String> content = new ArrayList();
        for (int i = 0; i < numberOfLines; i++) {
            content.add(word);
        }

        Path filePath = Paths.get(path);
        try
        {Files.write(filePath, content);
            System.out.println("It worked");
        } catch (IOException e) {
            System.out.println("It did not work, you are useless, Lucia");
        }
    }
}
