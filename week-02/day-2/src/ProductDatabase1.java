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

        int number = 0;
        for (Map.Entry<String, Integer> item: products.entrySet()) {
      //      number = products.values();
        }
    }
}
// https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/data-structures/product-database/README.md