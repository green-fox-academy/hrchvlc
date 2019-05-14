package buildingUsage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("/Users/lucia/Desktop/Codes/ferrilata-foundation-retake-exam/usage.csv");
        List<String> listOfEntering = new ArrayList<>(); //toto je list, kde dáme veci z dokumentu a budeme s nimi pracovať
        HashMap<String, Integer> map = new HashMap<>(); //tuto budeme ukladať páry "študent-počet študentov" alebo "mentor-počet mentorov"
        try {                                           //potrebujeme try, lebo pri čítaní dokumentu ho nemusí Java nájsť
            listOfEntering = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("could not open file");
        }

        for (String line : listOfEntering) { // pre každý riadok z tohto listu (kde je všetko z dokumentu)
            String[] words = line.split(";"); //rozdeľ text pomocou ; na časti
            String position = words[1]; // druhej časti rozdeleného textu priraď názov position
                if (position.equals("student")) { //keď sa premenná rovná "student"
                    if (map.containsKey(position)) { //opýtaj sa, či sa "student" nachádza v mape, ak ÁNO, pokračuj ďalej
                        int previousNumber = map.get(position); //ÁNO: daj mi value (hodnotu) počet študentov a nazvi to číslo previousNumber
                        map.put(position, previousNumber + 1); //ÁNO: a prepíš v mape dvojicu "študent-počet" a počet navýš o jeden
                    } else {
                        map.put(position, 1); //ak NIE je študent v mape, vytvor ho a pridaj túto dvojicu
                    }
                }
                if (position.equals("mentor")){ //opýtaj sa, či druhá časť rozdeleného textu (position) sa rovná "mentor"
                    if (map.containsKey(position)) { //opýtaj sa, či sa "mentor" nachádza v mape
                        int counter = map.get(position); //ak ÁNO: daj mi value (hodnotu) počtu mentorov a nazvi ho counter
                        map.put(position, counter + 1); //ak ÁNO: prepíš dvojicu "mentor-počet" nevýšením počtu o jeden
                    } else {
                        map.put(position, 1); //ak sa "mentor" nenachádza v mape, vytvor dvojicu "mentor-1" a vlož ju do mapy
                    }
                }
        }

        int countOfStudents = 0; //tuto budeme neskôr ukladať výsledok
        int countOfMentors = 0;  //tuto budeme neskôr ukladať výsledok
        for (HashMap.Entry<String, Integer> item: map.entrySet()) { //prejdi celou mapou a prejdi oboma jej hodnotami
            if (item.getKey().equals("student")) { //ak sa key hodnota (tá prvá, v našom prípade String) rovná "student"
                countOfStudents = item.getValue(); //vypľuj mi jej value (hodnotu, druhá v poradí, int) a nazvi ju countOfStudents
            } else {
                countOfMentors = item.getValue(); //ak sa key hodnota nerovná "student" ((rovná sa tým pádom "mentor"
            }                                     //daj mi jej value hodnotu a nazvi ju countOfMentors
        }
        try { //potrebujeme try, pretože zase pracujeme s dokumentom (zapisujeme do neho) a pokiaľ ho Java nenájde, potrebujeme to vypísať ako chybu
            PrintStream fileOut = new PrintStream("/Users/lucia/greenfox/hrchvlc/week-04/sunday/src/buildingUsage/output.txt");
            System.setOut(fileOut); //PrintStream som našla na Googli, treba ho zadefinovať ako Scanner
            System.out.println("Building usage"); //a treba Jave povedať, že teraz všetko, čo chcem vyprintovať, nech píše do dokumentu
            System.out.println();                   //čiže všetko od momentu "System.setOut(fileOut)" bude Java písať do dokumentu a nijak inak
            System.out.println("Students: " + countOfStudents); //vypíšeme, čo potrebujeme
            System.out.println("Mentors: " + countOfMentors);   //podľa zadania
        } catch (FileNotFoundException error) {                 //a ešte zadefinujeme chybu a čo má potom Java robiť
            System.out.println("file not found, sorry");        //HOTOVO! :)
        }
    }
}
