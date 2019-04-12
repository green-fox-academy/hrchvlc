// Given base and n that are both 1 or more, compute recursively (no loops) the value of base
// to the n power, so powerN(3, 2) is 9 (3 squared).

public class Power {
    public static void main(String[] args) {
        System.out.println(PowerN(8, 2));
    }

    public static int PowerN(int base, int n) {
        if ((base >= 1) && (n >= 1)) {                     // (n != 0)
            return (base * PowerN(base, n - 1));
        } return 1;
    }
}
