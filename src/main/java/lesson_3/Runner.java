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
            case 2 -> {
                SecondTask findNumInArr = new SecondTask();
                findNumInArr.chooseNumsInArr();
            }
            case 3 -> {
                ThirdTask compareAverage = new ThirdTask();
                compareAverage.compareArrays();
            }
            case 4 -> {
                FourthTask secondEvenArr = new FourthTask();
                secondEvenArr.checkArr();
            }
            case 5 -> {
                FifthTask changeOddInd = new FifthTask();
                changeOddInd.changeArray();
            }
            case 6 ->{
                SixthTask sortString = new SixthTask();
                sortString.sortedStrArr();
            }
            case 7 ->{
                SeventhTask sortBubble = new SeventhTask();
                sortBubble.bubbleSort();
            }
            case 8 ->{
                EighthTask multiplication = new EighthTask();
                multiplication.actions();
            }
            default -> System.out.println("Nonono wrong");
        }

    }
}
