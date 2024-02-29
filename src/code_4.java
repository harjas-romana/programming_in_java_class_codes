import java.util.Scanner;

public class code_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input the size of your square matrix: ");
        int size = sc.nextInt();
        char[][] matrixA = new char[size][size];
        char[][] matrixB = new char[size][size];
        System.out.println("Character type array declared.");
        System.out.println("Let's initialise it.");
        System.out.print("Input for Matrix A: ");
        for(int i=0; i<size;i++){
            for(int j=0; j<size;j++){
                matrixA[i][j] = sc.next().charAt(0);
                System.out.print(matrixA[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Input for Matrix B: ");
        for(int i=0; i<size;i++){
            for(int j=0; j<size;j++){
                matrixB[i][j] = sc.next().charAt(0);
                System.out.print(matrixB[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Combined Matrix is: ");
        for(int i=0; i<size;i++){
            for(int j=0; j<size;j++){
                System.out.print(matrixA[i][j]);
                System.out.print(matrixB[i][j]+" ");
            }
            System.out.println();
        }
    }
}