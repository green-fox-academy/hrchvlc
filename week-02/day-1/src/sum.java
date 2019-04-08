public class sum {

    public static int sum(int endNumber) {
        int sum = 0;
        for (int i = 0; i <= endNumber; i++) {
            sum = sum + i;
        } return sum;
    }

    public static void main(String[]args) {
        System.out.println(sum(5));
    }
}

// Create the usual class wrapper and main method on your own.

// Write a function called `sum` that returns the sum of numbers from zero to the given parameter