import java.util.*;

public class AppendA{
    public static void main(String... args){
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.
        System.out.println(appendA(far));
    }
    public static List<String> appendA(List<String> list) {
        List<String> newArray = new ArrayList<>();
            for (String item: list) {
                item = item + "a";
                newArray.add(item);
            }
        return newArray;
    }
}

// The output should be: "boa", "anaconda", "koala", "panda", "zebra"