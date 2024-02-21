package lesson_3;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the task");
        int choice = scanner.nextInt();
        switch (choice) {
            case 0 -> {
                ZeroTask existNumber = new ZeroTask();
                existNumber.checkMassive();
            }
            case 1 -> {
                FirstTask excludeNumber = new FirstTask();
                excludeNumber.changeArray();
            }

            default -> System.out.println("Nonono wrong");
        }

    }
}
