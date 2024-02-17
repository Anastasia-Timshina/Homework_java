package lesson_2;

import java.util.Scanner;

/*Задание 4

Напишите программу, которая будет выполнять проверку чисел на четность.
Предложите два варианта решения поставленной задачи.*/
public class EvenNumber {
    Scanner scanner = new Scanner(System.in);
    public void isEven(){
        System.out.println("Input your number:");
        int number = scanner.nextInt();
        System.out.println("Choose the variant: \n  1. check by the last number \n  2. check by %2");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                int lastNum = number % 10;
                if (lastNum == 0 || lastNum == 2 || lastNum == 4 || lastNum == 6 || lastNum == 8){
                    System.out.printf("%d is even!", number);
                }
                else {
                    System.out.printf("%d is not even!", number);
                }
                break;
            case 2:
                if (number % 2 == 0){
                    System.out.printf("%d is even!", number);
                }
                else {
                    System.out.printf("%d is not even!", number);
                }
                break;
            default:
                System.out.println("Something went wrong");
                break;
        }
    }
}
