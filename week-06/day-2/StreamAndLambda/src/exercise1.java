import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exercise1 {
    public static void main(String[] args) {
        // Write a Stream Expression to get the even numbers
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        numbers.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

        numbers.stream().filter(i -> i % 2 == 0).forEach(e -> System.out.println(e));

        List<Integer> myList = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(myList);
    }
}
