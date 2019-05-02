import java.util.ArrayList;
import java.util.List;

public class Sum {
    static List elements;


    public static int sumOf(List<Integer> elements) {
        int sum = 0;
        for (int i = 0; i < elements.size(); i++) {
            sum += elements.get(i);
        } return sum;
    }

    public static void main(String[] args) {
     /*   elements = new ArrayList();
        elements.add(1);
        elements.add(2);
        elements.add(3);
        elements.add(4);
        sumOf(elements);
        System.out.println(sumOf(elements));
        */
      //  double ratio = getRatio(3, 2);
      //  System.out.println(ratio);
    }

    public static double getRatio(int divident, int divisor) {
        if (divisor == 0) {
            return 0;
        }
        return divident/divisor;
    }
}
