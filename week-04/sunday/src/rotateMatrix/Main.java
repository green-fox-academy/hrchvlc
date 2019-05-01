package rotateMatrix;

public class Main {
    public static void main(String[] args) {
        int fuckingMatrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int frickingMatrix[][] = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12},{13, 14, 15, 16}};

        printMatrix(fuckingMatrix);
        System.out.println();
        printMatrix(rotateMatrix(fuckingMatrix));
        System.out.println();
        printMatrix(rotateMatrix(frickingMatrix));
    }

    public static int[][] rotateMatrix(int[][] thatArray) {
        int[][] secondMatrix = new int [thatArray.length][thatArray.length];
        for (int i = 0; i < thatArray.length; i++) {
            for (int j = 0; j < thatArray.length; j++) {
                secondMatrix[j][thatArray.length - i - 1] = thatArray[i][j];
            }
        }
        return secondMatrix;
    }
    private static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
