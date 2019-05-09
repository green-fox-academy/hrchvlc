import java.util.ArrayList;
import java.util.Collections;

public class PersonalFinance {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(500);
        list.add(1000);
        list.add(1250);
        list.add(175);
        list.add(800);
        list.add(120);

        int number = 0;
        for (int item: list) {
            number += item;
        }
        System.out.println(number);

        System.out.println("Max: " + Collections.max(list));
        System.out.println("Min: " + Collections.min(list));
        System.out.println("Average: " + number / list.size());
    }
}

// https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/data-structures/personal-finance/README.md