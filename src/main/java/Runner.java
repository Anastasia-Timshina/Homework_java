import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the task (1-5): ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                FirstTask changeStr = new FirstTask();
                changeStr.changingText();
            }
            case 2 -> {
                SecondTask str = new SecondTask();
                str.concat();
            }
            case 3 -> {
                ThirdTask strABC = new ThirdTask();
                strABC.findABC();
            }
            case 4 -> {
                FourthTask strToChange = new FourthTask();
                strToChange.replaceDay();
            }
            case 5 -> {
                FifthTask docNum = new FifthTask();
                docNum.miniRunner();
            }
            default -> System.out.println("Wrong option");
        }
    }
}
