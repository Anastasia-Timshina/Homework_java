import lesson_0.HelloWorld;
import lesson_2.CalculateTwoOperands;
import lesson_2.EvenNumber;
import lesson_2.IntInterval;
import lesson_2.Translator;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the task: ");
        int choice = scanner.nextInt();

        switch(choice){
            case 1:
                HelloWorld helloWorld = new HelloWorld();
                helloWorld.printName();
                break;
            case 2:
                CalculateTwoOperands calc = new CalculateTwoOperands();
                calc.CalulateAandB();
                break;
            case 3:
                IntInterval isInt = new IntInterval();
                isInt.isInterval();
                break;
            case 4:
                Translator translate = new Translator();
                translate.fillInDictionary();
                break;
            case 5:
                EvenNumber evenNum = new EvenNumber();
                evenNum.isEven();
                break;
            default:
                System.out.println("Sorry, choose smth else");
                break;
        }


    }
}
