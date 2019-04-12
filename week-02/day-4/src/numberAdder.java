//does not work

public class numberAdder {

    public static void main(String[] args) {

        System.out.println(numberAdder(4));

    }
    public static int numberAdder (int n) {
        if (n <= 1) {
         return 1;
        }
        return n + numberAdder(n - 1);
    }
}
