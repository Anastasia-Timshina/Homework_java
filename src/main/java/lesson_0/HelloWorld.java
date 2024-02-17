package lesson_0;

import java.util.Scanner;

public class HelloWorld {
    public void printName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name:");
        String user = scanner.next();
        System.out.println("Hello, " + user);

    }
}
