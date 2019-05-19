package mostCommonCharacter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
            mostCommonCharacter("/Users/lucia/greenfox/hrchvlc/week-04/sunday/src/mostCommonCharacter/countchar.txt");
        } catch(IOException e) {
            System.out.println("File does not exist!");
        }
    }

    public static HashMap<Character, Integer> mostCommonCharacter(String filename) throws IOException {
        Path myPath = Paths.get(filename);
        String characters = "";

        try {List<String> fileData = Files.readAllLines(myPath);
            for (String line: fileData) {
                characters = characters + line;
                HashMap<Character, Integer> map = new HashMap<>();
                for (int i = 0; i < characters.length(); i++) {
                    char countedCharacter = characters.charAt(i);
                    int occurrenceOfCounted = 0;
                    for (int j = 0; j < characters.length(); j++) {
                        if (countedCharacter == characters.charAt(j)) {
                            occurrenceOfCounted++;
                        }
                    }
                    map.put(countedCharacter, occurrenceOfCounted);
                }
                for (int i: map.values()) {

                }
            }
        } catch (IOException e) {
            throw new IOException("File does not exist!");
        }
        HashMap<Character, Integer> a = new HashMap<>();



        return a;
    }
}
