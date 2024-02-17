package lesson_2;

import java.util.Scanner;

/*Задание 1

Напишите программу - консольный калькулятор.
Создайте две переменные с именами operand1 и operand2.
Задайте переменным некоторые произвольные значения.
Предложите пользователю ввести знак арифметической операции.
Примите значение, введенное пользователем, и поместите его в строковую переменную sign.
Для организации выбора алгоритма вычислительного процесса, используйте переключатель switch.
Выведите на экран результат выполнения арифметической операции.
В случае использования операции деления, организуйте проверку попытки деления на ноль.
И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке пользователя.

*/
public class CalculateTwoOperands {
    Scanner scanner = new Scanner(System.in);

    public void CalulateAandB(){
        System.out.println("Input 2 numbers: ");
        System.out.print("First numb: ");
        int operand1 = scanner.nextInt();
        System.out.print("Second numb: ");
        int operand2 = scanner.nextInt();
        System.out.println();

        System.out.println("Choose operation:\n  '+',  '-',  '*',  '/'");
        String sign = scanner.next();

        switch(sign){
            case "+":
                System.out.printf("%d + %d = %d", operand1, operand2, operand1+operand2);
                break;
            case "-":
                System.out.printf("%d - %d = %d", operand1, operand2, operand1-operand2);
                break;
            case "*":
                System.out.printf("%d * %d = %d", operand1, operand2, operand1*operand2);
                break;
            case "/":
                if(operand2 != 0){
                    System.out.printf("%d / %d = %d", operand1, operand2, operand1/operand2);
                }
                else {
                    System.out.println("2nd operand cannot be equal to zero");
                }
                break;
            default:
                System.out.println("Wrong operation :(");
        }

    }
}
