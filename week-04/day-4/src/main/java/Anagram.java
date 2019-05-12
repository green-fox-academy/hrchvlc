import java.util.Arrays;

public class Anagram {
    String first;
    String second;

    public static void main(String[] args) {
    }

    public Anagram(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public static boolean gettingAnagrammed(String first, String second) {
        if (first == null || second == null) {
            return false;
        }
        first.toLowerCase();
        second.toLowerCase();
        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        if (Arrays.equals(firstArray, secondArray)) {
            return true;
        } else {
            return false;
        }
    }
}
