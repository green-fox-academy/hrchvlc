public class Factorial {

    public static int factorio(int endNumber) {
        int factorio = 1;
        for (int i = 1; i <= endNumber; i++) {
            factorio = factorio * i;
        }
        return factorio;
    }

    public static void main(String[]args) {
        System.out.println(factorio(5));
    }

}


//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial