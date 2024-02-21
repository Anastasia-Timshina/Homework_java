package lesson_3;

import java.util.Random;
import java.util.Scanner;

/*7.Реализуйте алгоритм сортировки пузырьком.*/
public class SeventhTask {
    Scanner scanner = new Scanner(System.in);
    void fillIn(int[] arr, int size) {
        System.out.println("Choose the type of initialization (number)\n  1. By index\n  2. By random\n  3. By hands");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                for (int i = 0; i < size; i++) {
                    arr[i] = i;
                }
            }
            case 2 -> {
                Random random = new Random();
                for (int i = 0; i < size; i++) {
                    arr[i] = (int) (Math.random() * 20) + 1;
                }
            }
            case 3 -> {
                for (int i = 0; i < size; i++) {
                    System.out.printf("%d element: ", i);
                    arr[i] = scanner.nextInt();
                }
            }
            default -> {
                System.out.println("Wrong option");
            }
        }
    }
    void sortyy(int[] arr, int size){
        boolean swapped;
        for (int i = 0; i < size - 1; i++) {
            swapped = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Обмен значениями
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
    void printArr(int[] arr, int size){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    void bubbleSort(){
        System.out.println("Input the size of an array");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        fillIn(arr, size);
        printArr(arr, size);

        System.out.println();

        sortyy(arr, size);
        printArr(arr, size);
    }
}
