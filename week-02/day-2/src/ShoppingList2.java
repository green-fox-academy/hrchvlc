import java.util.HashMap;
import java.util.Map;

public class ShoppingList2 {
    public static void main(String[] args) {
        HashMap<String, Double> storedProducts = new HashMap<>();
        HashMap<String, Integer> bobsList = new HashMap<>();
        HashMap<String, Integer> alicesList = new HashMap<>();

        storedProducts.put("Milk", 1.07);
        storedProducts.put("Rice", 1.59);
        storedProducts.put("Eggs", 3.14);
        storedProducts.put("Cheese", 12.60);
        storedProducts.put("Chicken breasts", 9.40);
        storedProducts.put("Apples", 2.31);
        storedProducts.put("Tomato", 2.58);
        storedProducts.put("Potato", 1.75);
        storedProducts.put("Onion", 1.10);

        bobsList.put("Milk", 3);
        bobsList.put("Rice", 2);
        bobsList.put("Eggs", 2);
        bobsList.put("Cheese", 1);
        bobsList.put("Chicken breasts", 4);
        bobsList.put("Apples", 1);
        bobsList.put("Tomato", 2);
        bobsList.put("Potato", 1);

        alicesList.put("Rice", 1);
        alicesList.put("Eggs", 5);
        alicesList.put("Chicken breasts", 2);
        alicesList.put("Apples", 1);
        alicesList.put("Tomato", 10);

        double bobsTotal = 0;
        double oneThing = 0;
        double priceOfThing = 0;
        double amountOfThing = 0;
        for (Map.Entry<String, Integer> item: bobsList.entrySet()) {
            for (Map.Entry<String, Double> product: storedProducts.entrySet()) {
                if (item.getKey() == product.getKey()) {
                    amountOfThing = item.getValue();
                    priceOfThing = product.getValue();
                    oneThing = amountOfThing * priceOfThing;
                    bobsTotal += oneThing;
                }
            }
        }
        System.out.println("Bob's total is: " + bobsTotal);

        double alicesTotal = 0;
        for (Map.Entry<String, Integer> item: alicesList.entrySet()) {
            for (Map.Entry<String, Double> product: storedProducts.entrySet()) {
                if (item.getKey() == product.getKey()) {
                    amountOfThing = item.getValue();
                    priceOfThing = product.getValue();
                    oneThing = amountOfThing * priceOfThing;
                    alicesTotal += oneThing;
                }
            }
        }
        System.out.println("Alice's total is: " + alicesTotal);

        for (Map.Entry<String, Integer> item: alicesList.entrySet()) {
            for (Map.Entry<String, Integer> thing : bobsList.entrySet()) {
                if (item.getKey() == "Rice" && thing.getKey() == "Rice") {
                    int aliceRice = item.getValue();
                    int bobRice = thing.getValue();
                    if (aliceRice > bobRice) {
                        System.out.println("Alice buys more rice.");
                    } else if (aliceRice < bobRice) {
                        System.out.println("Bob buys more rice.");
                    } else {
                        System.out.println("Equal?");
                    }
                }

            }
        }

    }
}
// https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/data-structures/shopping-list-2/README.md