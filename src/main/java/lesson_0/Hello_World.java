package lesson_0;
import java.util.Scanner;

public class Hello_World {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your name");
        String user = scanner.next();
        System.out.println("Hello, " + user);
    }
}
