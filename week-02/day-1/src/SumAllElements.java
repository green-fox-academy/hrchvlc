public class SumAllElements {
    public static void main(String[] args) {
        int[] ai = {3, 4, 5, 6, 7};
        int sum = 0;
        for (int number = 0; number < ai.length; number++) {
            sum += ai[number];
        }
        System.out.println(sum);
    }
}

// - Create an array variable named `ai`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements in `ai`
