import java.util.*;

public class Matchmaking{
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // If someone has no pair, he/she should be the element of the list too
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...
        //works, but might have better solution

        System.out.println(makingMatches(girls, boys));
    }
    public static ArrayList<String> makingMatches(List<String> girls, List<String> boys) {
        ArrayList<String> pairedCouples = new ArrayList<>();
        int boyIndex = 1;
        for (String girl: girls) {
            pairedCouples.add(girl);
        }
        for (String boy: boys) {
            pairedCouples.add(boyIndex, boy);
            if (pairedCouples.size() <= 9) {
                boyIndex = boyIndex + 2;
            } else {
                boyIndex++;
            }
        }
        return pairedCouples;
    }
}