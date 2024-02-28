import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the task (1-2): ");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                FirstTask changeStr = new FirstTask();
                changeStr.changingText();
                break;
            case 2:
                SecondTask str = new SecondTask();
                str.concat();
                break;
            default:
                System.out.println("Wrong option");
        }

    }
}
