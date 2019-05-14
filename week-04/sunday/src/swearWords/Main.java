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
    } //list: zoznam nadávok. druhý riadok: napíš mi riešenie metódy removeSwearWords s týmito parametrami, ktoré ti dám //tu vyvolávam funkciu, oži a pracuj!
    public static int removeSwearWords(String filename, List wordsToRemove) { //int, lebo ti na konci vypľuje číslo/počet nadávok v texte, zátvorka: čo potrebujeme, aby nám funkcia pracovala
        List<String> swearWords = new ArrayList<>(); //nový list, kde budeme zapisovať škaredé slovíčka
        List<String> lines; //riadky z dokumentu
        String[] words; // array slov z dokumentu, rozdelené medzerou, kde budeme kontrolovať, či sú škaredé
        try { //potrebujeme try, lebo zase pracujeme s dokumentom, ktorý keď Java nenájde, potrebuje vyhodiť chybu
            Path filePath = Paths.get(filename); //cesta k dokumentu cez tvoj PC, dodávaš ju pod menom filename v main metóde hore ako parameter
            lines = Files.readAllLines(filePath); //prečítaj každý riadok a zapíš ho do listu, použi uvedenú cestu
        } catch (Exception e) { //samozrejme, zápis chyby
            System.out.println("fuck it");
            return 0; //keďže nemáme void, ale int metódu, potrebujeme dať jeden return sem, aby nám povedal, keď sa niečo dojebe a nájde chybu
        }
        for (String line : lines) { //prechádzaj riadkami lines (čo je vlastne ArrayList), pre každý riadok:
            words = line.split(" "); //rozdeľ riadok a použi medzeru ako rozdeľovateľ a zapíš to do novej Array words
            for (String word : words) { // prechádzaj slovami v Array slová
                if (wordsToRemove.contains(word.toLowerCase())) { // ak list wordsToRemove (čo my sme určili, že je swearWords) obsahuje slovo zo slov (a pre istotu všetko malým)
                    swearWords.add(word); //pridaj slovo do Listu swearWords
                }
            }
        }
        return swearWords.size(); //vypľuj mi počet slov, ktoré sme zapísali do listu - veľkosť listu a hotovo :)
    }
}
