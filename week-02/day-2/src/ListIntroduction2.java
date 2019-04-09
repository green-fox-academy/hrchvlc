import java.util.ArrayList;
import java.util.Arrays;

public class ListIntroduction2 {
    public static void main(String[]args){

        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();

        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Blueberries");
        listA.add("Durian");
        listA.add("Lychee");

        listB.addAll(listA);
        System.out.println(listB);
        System.out.println(listA);

        System.out.println(listA.contains("Durian"));


        listB.remove("Durian");
        System.out.println(listB);

        StringBuilder builder = new StringBuilder(String.valueOf(listA));
        builder.insert(4, "Kiwifruit");
        System.out.println(listA);

        if (listA.size() == listB.size()) {
            System.out.println("Same");
        } else if (listA.size() > listB.size()) {
            System.out.println("A bigger than B");
        } else
            System.out.println("B bigger than A");

        System.out.println(listA.indexOf("Avocado"));
        System.out.println(listB.indexOf("Durian"));

        //   it is not in the same line as exercise wanted
        listB.add(4, "Passion Fruit");
        listB.add(5, "Pummelo");


        System.out.println(listA.get(2));
    }
}
