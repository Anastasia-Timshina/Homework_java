package lesson_3;

import java.util.Random;
import java.util.Scanner;

/*8. Умножение двух матриц.
Создайте два массива целых чисел размером 3х3 (две матрицы).
Напишите программу для умножения двух матриц.
(у меня это будут свои квадратные матрицы)
*/
public class EighthTask {
    Scanner scanner = new Scanner(System.in);
    void fillIn(int[][] matrix, int size, int AorB) {
        System.out.printf("Choose the type of initialization for the %d matrix (number)\n  1. By index\n  2. By random\n  3. By hands\n", AorB);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                int k = 0;
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        matrix[i][j] = k++;
                    }
                }
            }
            case 2 -> {
                //Random random = new Random();
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        matrix[i][j] = (int) (Math.random() * 10) + 1;
                    }
                }
            }
            case 3 -> {
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        System.out.printf("%d %d element: ", i, j);
                        matrix[i][j] = scanner.nextInt();
                    }
                }
            }
            default -> {
                System.out.println("Wrong option");
            }
        }
    }
    void printMatrix(int [][] matrix, int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    int[][] multiplication(int[][] matrixA, int[][] matrixB, int size){
        int[][] matrixC = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrixC[i][j] = 0;
                for (int k = 0; k < size; k++) {
                    matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return matrixC;
    }
    void actions(){
        //System.out.println("Input size of your matrix A and B");
        //int size = scanner.nextInt();
        int size = 3;
        System.out.printf("Your matrix will be %d x %d\n", size, size);

        int [][] matrixA = new int[size][size];
        fillIn(matrixA, size, 1);
        int [][] matrixB = new int[size][size];
        fillIn(matrixB, size, 2);

        System.out.println("First matrix: ");
        printMatrix(matrixA, size);
        System.out.println("Second matrix: ");
        printMatrix(matrixB, size);

        int [][] matrixС = multiplication(matrixA, matrixB, size);
        System.out.println("Result matrix: ");
        printMatrix(matrixС, size);
    }
}
