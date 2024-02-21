package lesson_3;

import java.util.Arrays;
import java.util.Scanner;

/*11. Создайте двумерный массив целых чисел.
Отсортируйте элементы в строках
двумерного массива по возрастанию.*/
public class EleventhTask {
    Scanner scanner = new Scanner(System.in);
    void fillIn(int[][] matrix, int rows, int cols) {
        System.out.print("Choose the type of initialization (number)\n  1. By index\n  2. By random\n  3. By hands\n");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                int k = 0;
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        matrix[i][j] = k++;
                    }
                }
            }
            case 2 -> {
                //Random random = new Random();
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        matrix[i][j] = (int) (Math.random() * 10) + 1;
                    }
                }
            }
            case 3 -> {
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
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
    void printMatrix(int [][] matrix, int rows, int cols){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    void sortyy(int[][] matrix, int rows){
        for (int i = 0; i < rows; i++) {
            Arrays.sort(matrix[i]);
        }
    }
    void actions(){
        System.out.println("Input rows of your matrix A and B");
        int rows = scanner.nextInt();
        System.out.println("Input cols of your matrix A and B");
        int cols = scanner.nextInt();
        int [][] matrix = new int[rows][cols];

        fillIn(matrix, rows, cols);
        printMatrix(matrix, rows, cols);

        System.out.println();
        sortyy(matrix, rows);

        printMatrix(matrix, rows, cols);

    }
}
