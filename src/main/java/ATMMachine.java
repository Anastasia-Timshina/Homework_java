/*3. Создать класс, описывающий банкомат.
Набор купюр, находящихся в банкомате, должен задаваться тремя
свойствами:
количеством купюр номиналом 20, 50 и 100.
Сделать метод для добавления денег в банкомат.
Сделать метод, снимающуий деньги, который принимает сумму денег,
а возвращает булевое значение - успешность выполнения операции.
При снятии денег метод должен распечатывать каким количеством
купюр какого номинала выдаётся сумма.
Создать конструктор с тремя параметрами - количеством купюр каждого
номинала.
*/
public class ATMMachine {
    private int twentyBillCount;
    private int fiftyBillCount;
    private int hundredBillCount;

    public ATMMachine(int twentyBillCount, int fiftyBillCount, int hundredBillCount) {
        this.twentyBillCount = twentyBillCount;
        this.fiftyBillCount = fiftyBillCount;
        this.hundredBillCount = hundredBillCount;
    }

    public void addMoney(int twentyBills, int fiftyBills, int hundredBills) {
        twentyBillCount += twentyBills;
        fiftyBillCount += fiftyBills;
        hundredBillCount += hundredBills;
    }

    public boolean withdrawMoney(int amount) {
        int remainingAmount = amount;

        int twentyBillsToWithdraw = Math.min(remainingAmount / 20, twentyBillCount);
        remainingAmount -= twentyBillsToWithdraw * 20;

        int fiftyBillsToWithdraw = Math.min(remainingAmount / 50, fiftyBillCount);
        remainingAmount -= fiftyBillsToWithdraw * 50;

        int hundredBillsToWithdraw = Math.min(remainingAmount / 100, hundredBillCount);
        remainingAmount -= hundredBillsToWithdraw * 100;

        if (remainingAmount == 0) {
            twentyBillCount -= twentyBillsToWithdraw;
            fiftyBillCount -= fiftyBillsToWithdraw;
            hundredBillCount -= hundredBillsToWithdraw;
            printWithdrawalDetails(amount, hundredBillsToWithdraw, fiftyBillsToWithdraw, twentyBillsToWithdraw);
            return true;
        } else {
            System.out.println("Unable to withdraw amount, insufficient funds :(");
            return false;
        }
    }

    private void printWithdrawalDetails(int amount, int hundredBills, int fiftyBills, int twentyBills) {
        System.out.println("Withdrawal details:");
        System.out.println("Amount: $" + amount);
        System.out.println("Hundred bills: " + hundredBills);
        System.out.println("Fifty bills: " + fiftyBills);
        System.out.println("Twenty bills: " + twentyBills);
        System.out.println();
    }
}
