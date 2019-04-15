// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[]args){
        numberOfLines("/your-file.txt");
        System.out.println(numberOfLines("/Users/lucia/greenfox/hrchvlc/week-03/day-1/day-1.iml"));
    }
    public static int numberOfLines (String filename) {
        Path filePath = Paths.get(filename);
        try {
            List<String> lines = Files.readAllLines(filePath);
            return lines.size();
        } catch (IOException e){
            return 0;
        }
    }
}
