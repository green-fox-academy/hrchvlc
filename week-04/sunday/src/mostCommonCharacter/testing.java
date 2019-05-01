package mostCommonCharacter;

import java.io.IOException;
        import java.nio.file.Files;
        import java.nio.file.Path;
        import java.nio.file.Paths;
        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;


public class testing {
    public static void main(String[] args) {
    }

    public static HashMap<Character, Integer> mostCommonCharacter (String fileName) throws IOException {
        // read the file
        Path path = Paths.get(fileName);
        String allLetters = "";
        try {
            // get the content from the file
            List<String> fileData = Files.readAllLines(path);
            for (String line : fileData)  {
                allLetters = allLetters + line;
            }
        } catch (IOException e){
            // throw exception if it does not exist
            throw new IOException("File does not exist!");
        }

        return getMostCommon(allLetters);
    }

    public static HashMap<Character, Integer> getMostCommon(String allLetters){
        HashMap<Character, Integer> map = new HashMap<>();
        // Build a HashMap that stores characters and occurrences
        // process the content
        int maxOccurrence = 0;
        int maxOccurrence2 = 0;
        char maxChar = '\u0000';
        char maxChar2 = '\u0000';
        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < allLetters.length(); i++) {
                char countedCharacter = allLetters.charAt(i);
                int occurrenceOfCounted = getOccurrence(allLetters, countedCharacter);
                //  map.put(countedCharacter, occurrenceOfCounted);
                if ((k == 0) && occurrenceOfCounted > maxOccurrence) {
                    maxOccurrence = occurrenceOfCounted;
                    maxChar = countedCharacter;
                } else if (occurrenceOfCounted > maxOccurrence2 && (countedCharacter != maxChar)) {
                    maxOccurrence2 = occurrenceOfCounted;
                    maxChar2 = countedCharacter;
                }
            }
        }
        map.put(maxChar, maxOccurrence);
        return map;
    }
    public static Integer getOccurrence(String allLetters, char countedCharacter){
        int occurrenceOfCounted = 0;
        // another loop four counting occurrences of countedCharacter:
        for (int j = 0; j < allLetters.length(); j++) {
            if (countedCharacter == allLetters.charAt(j)) {
                occurrenceOfCounted++;
            }
        }
        return occurrenceOfCounted;
    }
}