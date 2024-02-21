package lesson_3;

import java.util.Random;
import java.util.Scanner;

/*5. Создайте массив и заполните массив.
Выведите массив на экран в строку.
Замените каждый элемент с нечётным индексом на ноль.
Снова выведете массив на экран на отдельной строке. */
public class FifthTask {
    Scanner scanner = new Scanner(System.in);
    void printArr(int[] arr, int size){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    void fillInArr(int [] arr,int size){
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 20) + 1;
        }
    }

    void changing(int[] arr, int size){
        for (int i = 0; i < size; i++) {
            if(i % 2 == 1){
                arr[i] = 0;
            }
        }
    }
    void changeArray(){
        System.out.println("Input the size of an array");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        fillInArr(arr, size);
        printArr(arr, size);
        System.out.println();
        changing(arr, size);

        printArr(arr, size);
    }
}
