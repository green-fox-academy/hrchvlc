
import java.util.ArrayList;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("eggs");
        list.add("milk");
        list.add("fish");
        list.add("apples");
        list.add("bread");
        list.add("chicken");

        System.out.println(list.contains("milk"));

        System.out.println(list.contains("bananas"));
    }
}
// https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/data-structures/shopping-list/README.md