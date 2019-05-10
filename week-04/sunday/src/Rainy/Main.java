package Rainy;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("/Users/lucia/greenfox/hrchvlc/week-04/sunday/src/Rainy/cities.txt");
        List<String> listOfCities = new ArrayList<>(); // za array vzdy tip potom nazov
        HashMap<String, Integer> rainPerCity = new HashMap<>();
        try {
            listOfCities = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("could not open file");
        }

        for (String line : listOfCities) {
            String[] words = line.split(",");
            String city = words[1];
            // System.out.println(city);
            String weather = words[2];
            // System.out.println(weather);
            if (weather.equals("RAINY")) {   // ako argument to berie String ktory si urcime
                if (rainPerCity.containsKey(city)) {   // kazdemu mestu priradime pocet kolko krat sa opakuje
                    int previousNumber = rainPerCity.get(city);
                    rainPerCity.put(city, previousNumber + 1);
                } else {
                    rainPerCity.put(city, 1);
                }
            }
        }
        int max = 0;
        String mostRainyCity = "";
        for (String city : rainPerCity.keySet()) {
            if (mostRainyCity.equals("")) {
                mostRainyCity = city;
            }

            int countOfRains = rainPerCity.get(city);
            rainPerCity.get(city);
            if (countOfRains > max) {
                max = countOfRains;
                mostRainyCity = city;
            }
        }
        System.out.println(mostRainyCity);
    }
}


//### Most rainy days
//
//Write a method which can read and parse a file containing information about
//weather in various cities. The method must return the name of the city which
//had the most rainy days.
//
//#### Example
//
//[Example file can be found here.](../../../cities.csv)
//
//Output
//
//