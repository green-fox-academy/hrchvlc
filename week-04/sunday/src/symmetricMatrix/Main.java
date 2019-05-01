package symmetricMatrix;

public class Main {
    public static void main(String[] args) {
        int symmetricalMatrix[][] = {{1, 0, 1}, {0, 2, 2}, {1, 2, 5}};
        int asymmetricalMatrix[][] = {{7, 7, 7},{6, 5, 7},{1, 2, 1}};
        int weirdMatrix[][] = {{1, 2, 2, 3, 4}, {2, 1, 3, 4, 5}, {2, 3, 1, 5, 6}, {3, 4, 5, 1, 6}, {4, 5, 6, 6, 1}};
        int forTheNextFunctionMatrix[][] = {{1, 0, 1}, {2, 2, 0}, {5, 2, 1}};
        System.out.println(isSymmetric(symmetricalMatrix));
        System.out.println();
        System.out.println(isSymmetric(asymmetricalMatrix));
        System.out.println();
        System.out.println(isSymmetric(weirdMatrix));
        System.out.println();
        System.out.println(anotherIsSymmetric(forTheNextFunctionMatrix));
    }

    public static boolean isSymmetric (int[][] inputMatrix) {
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[i].length; j++) {
                if (inputMatrix[i][j] != inputMatrix[j][i]) {
                    System.out.println("The first indexes where matrix is not symmetric: " + i + " and " + j);
                    return false;
                }
            }
        } return true;
    }

    public static boolean anotherIsSymmetric (int[][] inputMatrix) {
        int lastIndex = inputMatrix.length - 1;
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[i].length; j++) {
                if (inputMatrix[lastIndex - i][lastIndex - j] != inputMatrix[j][i]) {
                    return false;
                }
            }
        } return true;
    }
}
