import java.util.HashMap;
import java.util.Map;

public class ProductDatabase2 {
    public static void main(String[] args) {
        HashMap<String, Integer> products = new HashMap<>();
        products.put("Eggs", 200);
        products.put("Milk", 200);
        products.put("Fish", 400);
        products.put("Apples", 150);
        products.put("Bread", 50);
        products.put("Chicken", 550);

        int count = 0;
        for (Map.Entry<String, Integer> item: products.entrySet()) {
            if (item.getValue() < 201) {
                System.out.println(item.getKey());
                count++;
            }
        } System.out.println("How many below 201? " + count);

        System.out.println("More than 150:");
        for (Map.Entry<String, Integer> item: products.entrySet()) {
            if (item.getValue() > 150) {
                System.out.println(item.getKey() + ", " + item.getValue());
            }
        }


    }
}
// https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/data-structures/product-database-2/README.md