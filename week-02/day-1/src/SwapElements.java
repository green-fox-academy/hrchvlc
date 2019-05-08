public class SwapElements {
    public static void main(String[] args) {
        String[] abc = {"first", "second", "third"};
        abc[0] = "third";
        abc[2] = "first";

        for (String item:abc) {
            System.out.println(item);
        }
    }
}
// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`