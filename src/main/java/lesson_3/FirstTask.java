package lesson_3;

import java.util.Random;
import java.util.Scanner;

/*
*1. Создайте массив целых чисел. Удалите все вхождения
заданного числа из массива.
Пусть число задается с консоли. Если такого числа нет - выведите
сообщения об этом.
В результате должен быть новый массив без указанного числа.
* */
public class FirstTask {
    Scanner scanner = new Scanner(System.in);
    public void changeArray(){
        System.out.println("Input the size of an array");
        int size = scanner.nextInt();
        int[] arr = new int[size];

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
                break;
            }
            case 3 -> {
                for (int i = 0; i < size; i++) {
                    System.out.printf("%d element: ", i);
                    arr[i] = scanner.nextInt();
                }
                break;
            }
            default -> {
                System.out.println("Wrong option");
                break;
            }
        }

        System.out.println("Input your number to exclude");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(arr[i] == number){
                count++;
            }
        }
        int[] arr2 = new int[size - count];
        int k = 0;
        for (int i = 0; i < size; i++) {
            if(arr[i] != number) {
                arr2[k] = arr[i];
                k++;
            }
        }
        System.out.println("Result arr: ");
        for (int i = 0; i < size-count; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
