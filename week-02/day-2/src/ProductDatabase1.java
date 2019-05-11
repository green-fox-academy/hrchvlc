import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ProductDatabase1 {
    public static void main(String[] args) {
        HashMap<String, Integer> products = new HashMap<>();
        products.put("Eggs", 200);
        products.put("Milk", 200);
        products.put("Fish", 400);
        products.put("Apples", 150);
        products.put("Bread", 50);
        products.put("Chicken", 550);

        System.out.println("Fish is: " + products.get("Fish"));

        int price = 0;
        for (int item: products.values()) {
           if (price < item) {
            price = item;
           }
        }
       for (Map.Entry<String, Integer> item: products.entrySet()) {
           if (item.getValue() == price) {
               System.out.println("Most expensive: " + price + ",it is a fucking " + item.getKey());
           }
       }
       int average = 0;
        for (Map.Entry<String, Integer> item: products.entrySet()) {
            average += item.getValue();
        }
        average = average / products.size();
        System.out.println("Average: " + average);

        int count = 0;
        for (Map.Entry<String, Integer> item: products.entrySet()) {
            if (item.getValue() < 300) {
                count++;
            }
        } System.out.println("How many below 300? " + count);

        if (products.containsValue(125)) {
            System.out.println("You can buy something with it");
        } else {
            System.out.println("Nah, nothing exact here.");
        }

        System.out.println("Cheapest: " + Collections.min(products.values()));


    }
}
// https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/data-structures/product-database/README.md