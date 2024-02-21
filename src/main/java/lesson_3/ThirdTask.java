package lesson_3;

import java.util.Random;

/*3. Создайте 2 массива из 5 чисел.
Выведите массивы на консоль в двух отдельных строках.
Посчитайте среднее арифметическое элементов каждого массива
и сообщите, для какого из массивов это значение оказалось
больше (либо сообщите, что их средние арифметические равны).
*/
public class ThirdTask {
    void printArr(int[] arr, int size){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    void fillInArr(int [] arr,int size){
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 20) + 1;
        }
    }
    double findAverageNum(int[] arr, int size){
        double number = 0;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        number = (double) sum / size;
        return number;
    }
    void compareArrays(){
        int size = 5;
        int[] arr1 = new int [size];
        int[] arr2 = new int [size];

        fillInArr(arr1, size);
        fillInArr(arr2, size);

        System.out.println("First array: ");
        printArr(arr1, size);
        System.out.println("Second array: ");
        printArr(arr2, size);

        double averageFirst = findAverageNum(arr1, size);
        double averageSecond = findAverageNum(arr2, size);

        if(averageFirst == averageSecond){
            System.out.printf("Averages are equal (first: %.2f and second: %.2f", averageFirst, averageSecond);
        }else if (averageFirst < averageSecond){
            System.out.printf("Average of the second is bigger (first: %.2f and second: %.2f", averageFirst, averageSecond);
        }else {
            System.out.printf("Average of the first is bigger (first: %.2f and second: %.2f", averageFirst, averageSecond);
        }
    }
}
