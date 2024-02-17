package lesson_2;

import java.util.HashMap;
import java.util.Scanner;

/*Задание 3

        Напишите программу русско-английский переводчик.
        Программа знает 10 слов о погоде.
        Требуется, чтобы пользователь вводил слово на русском языке,
        а программа давала ему перевод этого слова на английском языке.
        Если пользователь ввел слово, для которого отсутствует перевод,
        то следует вывести сообщение, что такого слова нет.
*/
public class Translator {
    Scanner scanner = new Scanner(System.in);
    public void fillInDictionary(){
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("жара", "heat");
        dictionary.put("солнце", "sun");
        dictionary.put("облачно", "cloudy");
        dictionary.put("туман", "fog");
        dictionary.put("ветер", "wind");
        dictionary.put("дождь", "rain");
        dictionary.put("гроза", "storm");
        dictionary.put("ливень", "downpour");
        dictionary.put("холод", "cold");
        dictionary.put("снег", "snow");

        System.out.println("Input your russian word: \n'жара, солнце, " +
                "облачно, туман, ветер, дождь, гроза, ливень, холод, снег'");
        String rusWord = scanner.nextLine();
        String engTransl = dictionary.get(rusWord.toLowerCase());

        if (engTransl != null) {
            System.out.println("Your translation: " + engTransl);
        } else {
            System.out.println("This word does not exist in our dictionary");
        }
    }
}
