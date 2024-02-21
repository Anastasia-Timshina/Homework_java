package lesson_3;

import java.util.Arrays;
import java.util.Scanner;

/*6. Создайте массив строк.
Заполните его произвольными именами людей.
Отсортируйте массив.
Результат выведите на консоль.  */
public class SixthTask {
    Scanner scanner = new Scanner(System.in);
    void fillinNames(String [] arr, int size){
        System.out.println("Input names separated by space");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.next();
        }
    }
    void printNames(String[] arr, int size){
        for (int i = 0; i < size; i++) {
            if (i == size - 1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
    void sorting(String[] arr){
        Arrays.sort(arr);
    }
    void sortedStrArr(){
        System.out.println("Input the amount of words");
        int size = scanner.nextInt();
        String[] names = new String[size];

        fillinNames(names, size);
        System.out.println("\nNames:");
        printNames(names, size);

        sorting(names);
        System.out.println("\n\nSorted String array: ");
        printNames(names, size);
    }
}
