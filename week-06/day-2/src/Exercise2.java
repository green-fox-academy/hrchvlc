import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) {
        // Write a Stream Expression to get the squared value of the positive numbers
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        List<Integer> myList = numbers.stream().filter(i -> i > 0)
                .map(i -> (int) Math.pow(i, 2))
                .collect(Collectors.toList());
        System.out.println(myList);
    }
}
