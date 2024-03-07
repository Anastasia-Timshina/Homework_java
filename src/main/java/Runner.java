import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the task: (1-2)");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                Phone firstPhone = new Phone(12, "iphone12", 123);
                Phone secondPhone = new Phone(23, "iphone13pro", 145);
                Phone thirdPhone = new Phone(42, "iphone15promax", 180);

                System.out.println(firstPhone);
                System.out.println(secondPhone);
                System.out.println(thirdPhone);

                firstPhone.receiveCall("Nastya");
                System.out.println(secondPhone.getNumber());
                thirdPhone.receiveCall("Dasha", 87878787);
                firstPhone.sendMessage(654738, 653290, 76239);

            }
            case 2 -> {
                CreditCard card1 = new CreditCard("1111111111111111", 0.0);
                CreditCard card2 = new CreditCard("2222222222222222", 500.0);
                CreditCard card3 = new CreditCard("3333333333333333", 1000.0);

                card1.deposit(500.0);

                System.out.println("Enter deposit for 2 card");
                double amount = scanner.nextDouble();
                card2.deposit(amount);
                System.out.println("---------------------------------------");

                card3.withdraw(1500.0);

                System.out.println("---------------------------------------");
                card1.printCardInfo();
                card2.printCardInfo();
                card3.printCardInfo();

            }
        }
    }
}
