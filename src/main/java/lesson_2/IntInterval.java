package lesson_2;


import java.util.Scanner;

/*
Задание 2

        Напишите программу определения, попадает ли указанное пользователем число
        от 0 до 100 в числовой промежуток [0 - 14] [15 - 35] [36 - 50][50 - 100].
        Если да, то укажите, в какой именно промежуток.
        Если пользователь указывает число, не входящее ни в один из имеющихся
        числовых промежутков, то выводится соответствующее сообщение.
*/
public class IntInterval {
    Scanner scanner = new Scanner(System.in);
    public void isInterval(){
        System.out.println("Input number");
        int number = scanner.nextInt();
        if (number < 0){
            System.out.println("Does not correspond to the intervals given to us");
        }
        else if (number < 15){
            System.out.println("Corresponds to the interval [0 - 14]");
        }
        else if (number < 36){
            System.out.println("Corresponds to the interval [15 - 35]");
        }
        else if (number < 50){
            System.out.println("Corresponds to the interval [36 - 50]");
        }
        else if (number == 50){
            System.out.println("Corresponds to the interval [36 - 50] and [50 - 100]");
        }
        else if (number < 101){
            System.out.println("Corresponds to the interval [50 - 100]");
        }
        else{
            System.out.println("Does not correspond to the intervals given to us");
        }
    }
}
