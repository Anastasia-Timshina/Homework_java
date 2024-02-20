package lesson_3;

import java.util.Random;
import java.util.Scanner;

/* 0 Создайте массив целых чисел. Напишете программу,
   которая выводит сообщение о том, входит ли заданное
   число в массив или нет. Пусть число для поиска задается с консоли.
 */
public class FirstMassive {
    Scanner scanner = new Scanner(System.in);
    public void checkMassive(){
        System.out.println("Input the size of a massive");
        int size = scanner.nextInt();
        int[] mas = new int[size];
        System.out.println("Choose the type of initialization (number)\n  1. By index\n  2. By random\n  3. By hands");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                for (int i = 0; i < size; i++) {
                    mas[i] = i;
                }
            }
            case 2 -> {
                Random random = new Random();
                for (int i = 0; i < size; i++) {
                    mas[i] = (int) (Math.random() * 20) + 1;
                }
                break;
            }
            case 3 -> {
                for (int i = 0; i < size; i++) {
                    System.out.printf("%d element: ", i);
                    mas[i] = scanner.nextInt();
                }
                break;
            }
            default -> {
                System.out.println("Wrong option");
                break;
            }
        }
        System.out.println("Input your number to find");
        int number = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            if (mas[i] == number){
                System.out.printf("Yes, number %d exist in this massive", number);
                break;
            }
            if((i==size-1) && mas[i] != number){
                System.out.printf("No, number %d does not exist in this massive", number);
            }
        }
    }
}
