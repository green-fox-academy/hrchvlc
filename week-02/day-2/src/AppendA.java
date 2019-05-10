import java.util.*;

public class AppendA{
    public static void main(String... args){
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.
        // System.out.println(appendA(far));

        appendA(far);
    }
    public static void appendA(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString() + "a");
        }
    }
}

// The output should be: "boa", "anaconda", "koala", "panda", "zebra"