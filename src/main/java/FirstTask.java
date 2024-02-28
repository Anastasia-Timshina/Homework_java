import java.util.Scanner;

/*1. Заменить в строке все вхождения 'test'
на 'testing'. Удалить из текста все символы,
являющиеся цифрами.*/
public class FirstTask {
    Scanner scanner = new Scanner(System.in);
    public void changingText(){
        System.out.println("Input string");
        String str = scanner.nextLine();

        str = str.replace("test", "testing");
        str = str.replaceAll("[0-9]", "");

        System.out.println(str);
    }
}
