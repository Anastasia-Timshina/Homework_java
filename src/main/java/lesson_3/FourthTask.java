package lesson_3;

import java.util.Random;
import java.util.Scanner;

/*4. Создайте массив из n случайных целых чисел и выведите его на экран.
Размер массива пусть задается с консоли и размер массива может быть больше 5 и меньше или равно 10.
Если n не удовлетворяет условию - выведите сообщение об этом.
Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
Создайте второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.  */
public class FourthTask {
    Scanner scanner = new Scanner(System.in);
    void fillInArray(int[] arr, int size){
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 20) + 1;
        }
    }
    void printArr(int[] arr, int size){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    void checkArr() {
        int size = 0;
        while (true) {
            System.out.println("Input size of an array (6-10)");
            size = scanner.nextInt();
            if ((size > 5) && (size <= 10)) {
                break;
            }
            else
                System.out.println("Try again, wrong input");
        }

        int[] arr1 = new int[size];
        fillInArray(arr1, size);

        System.out.println("First array: ");
        printArr(arr1, size);

        int size2 = 0;
        for (int i = 0; i < size; i++) {
            if(arr1[i] % 2 == 0){
                size2++;
            }
        }

        int[] arr2 = new int[size2];
        int k = 0;
        for (int i = 0; i < size; i++) {
            if(arr1[i] % 2 == 0){
                arr2[k++] = arr1[i];

            }
        }
        System.out.println("\nSecond array: ");
        printArr(arr2, size2);
    }
}
