package lesson_3;

import java.util.Random;
import java.util.Scanner;

/*
2. Создайте и заполните массив случайным числами и
выведете максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Random() .
Пусть будет возможность создавать массив произвольного размера.
Пусть размер массива вводится с консоли.  */
public class SecondTask {
    Scanner scanner = new Scanner(System.in);
    void fillInArray(int[] arr, int size){
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 20) + 1;
        }
    }
    int findMinNum(int[] arr, int size){
        int number = arr[0];
        for (int i = 1; i < size; i++) {
            if(number > arr[i]){
                number = arr[i];
            }
        }
        return number;
    }
    int findMaxNum(int[] arr, int size){
        int number = arr[0];
        for (int i = 1; i < size; i++) {
            if(number < arr[i]){
                number = arr[i];
            }
        }
        return number;
    }
    double findAverageNum(int[] arr, int size){
        double number = 0;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        number = (double) sum / size;
        return number;
    }
    void printArr(int[] arr, int size){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    void chooseNumsInArr(){
        System.out.println("Input the size of an array");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        fillInArray(arr, size);
        printArr(arr, size);
        System.out.printf("\nMin number of this arr is %d\n", findMinNum(arr, size));
        System.out.printf("Max number of this arr is %d\n", findMaxNum(arr, size));
        System.out.printf("Average number of this arr is %.2f\n", findAverageNum(arr, size));

    }
}
