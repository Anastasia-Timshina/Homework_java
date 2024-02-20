package lesson_3;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the task");
        int choise = scanner.nextInt();
        switch(choise){
            case 1:
                FirstMassive mas = new FirstMassive();
                mas.checkMassive();
                break;
            default:
                System.out.println("Nonono wrong");
                break;
        }

    }
}
