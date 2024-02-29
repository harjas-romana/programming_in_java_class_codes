import java.util.Scanner;

public class code_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrixA = new int[2][2];
        int[][] matrixB = new int[2][2];

        System.out.println("Enter Elements for Matrix A");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Elements for Matrix B");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }

        combinedMatrixPrint(matrixA, matrixB);
    }

    public static void combinedMatrixPrint(int[][] matrixA, int[][] matrixB) {
        System.out.println("Combined Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrixA[i][j]+ matrixB[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
