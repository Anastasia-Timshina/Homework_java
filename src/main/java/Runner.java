import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the task: (1)");
        int choice = scanner.nextInt();

        switch (choice){
            case 1: {
                Phone firstPhone = new Phone (12, "iphone12", 123);
                Phone secondPhone = new Phone (23, "iphone13pro", 145);
                Phone thirdPhone = new Phone (42, "iphone15promax", 180);

                System.out.println(firstPhone);
                System.out.println(secondPhone);
                System.out.println(thirdPhone);

                firstPhone.receiveCall("Nastya");
                System.out.println(secondPhone.getNumber());
                thirdPhone.receiveCall("Dasha", 87878787);
                firstPhone.sendMessage(654738, 653290, 76239);

                break;
            }
        }
    }
}
