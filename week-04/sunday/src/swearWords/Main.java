package swearWords;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> swearWord = new ArrayList<>(Arrays.asList("fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss", "cunt"));
        System.out.println(removeSwearWords("/Users/lucia/greenfox/hrchvlc/week-04/sunday/src/swearWords/content.txt", swearWord));
    }
    public static int removeSwearWords(String filename, List wordsToRemove) {
        List<String> swearWords = new ArrayList<>();
        List<String> lines;
        String[] words;
        try {
            Path filePath = Paths.get(filename);
            lines = Files.readAllLines(filePath);
        } catch (Exception e) {
            System.out.println("fuck it");
            return 0;
        }
        for (String line : lines) {
            words = line.split(" ");
            for (String word : words) {
                if (wordsToRemove.contains(word.toLowerCase())) {
                    swearWords.add(word);
                }
            }
        }
        return swearWords.size();
    }
}
