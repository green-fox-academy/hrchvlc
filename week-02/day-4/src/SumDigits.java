public class SumDigits {
    public static void main(String[]args) {

        System.out.println(SumOfDigits(845607));
    }

    public static int SumOfDigits(int number) {
        if (number > 0) {
            if (number >= 10) {
                return (number % 10 + SumOfDigits(number / 10));
            } else {
                return (number % 10);
            }
        }
        return 0;
    }
}
