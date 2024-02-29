import java.util.Scanner;

/*5. Написать программу со следующим функционалом:
На вход передать строку (будем считать, что это номер документа).
Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число,
а y — это буква.

Все методы реализовать в отдельном классе в статических методах,
которые на вход (входным параметром) будут принимать вводимую на
вход программы строку.*/
public class FifthTask {

    public void miniRunner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of the document\nxxxx-yyy-xxxx-yyy-xyxy\n->");
        String numOfDoc = scanner.nextLine();
        print2xxxx(numOfDoc);
        yyyToStars(numOfDoc);
        lettersOfNum(numOfDoc);
        lettersOfNumUp(numOfDoc);
        isABC(numOfDoc);
        is555(numOfDoc);
        ends1a2b(numOfDoc);
    }
    //Вывести на экран в одну строку два первых блока по 4 цифры.
    public static void print2xxxx(String numOfDoc){
        System.out.println("\nFirst xxxx xxxx: ");
        /*String[] blocks = numOfDoc.split("-");

        String block1 = blocks[0];
        String block2 = blocks[2];
        String finalStr = block1 + " " + block2;
        System.out.println(finalStr);*/

        String block1 = numOfDoc.substring(0, 4);
        String block2 = numOfDoc.substring(9, 13);
        String finalStr = block1 + " " + block2;
        System.out.println(finalStr);
    }

    //Вывести на экран номер документа, но блоки из трех букв заменить
    //на *** (каждая буква заменятся на *).
    public static void yyyToStars(String numOfDoc){
        System.out.println("\nChanged yyy to ***: ");
        StringBuilder changedNums = new StringBuilder(numOfDoc);

        for (int i = 0; i < changedNums.length() - 2; i++) {
            if (isBlockYYY(changedNums, i)) {
                changedNums.setCharAt(i, '*');
                changedNums.setCharAt(i + 1, '*');
                changedNums.setCharAt(i + 2, '*');
            }
        }

        String str2 = changedNums.toString();
        System.out.println(str2);
    }

    private static boolean isBlockYYY(StringBuilder sb, int index) {
        if (index + 2 < sb.length()) {
            return Character.isLetter(sb.charAt(index)) &&
                    Character.isLetter(sb.charAt(index + 1)) &&
                    Character.isLetter(sb.charAt(index + 2));
        }
        return false;
    }

    //Вывести на экран только одни буквы из номера документа в
    //формате yyy/yyy/y/y в нижнем регистре.
    public static void lettersOfNum(String numOfDoc){
        System.out.println("\nyyy/yyy/y/y: ");
        StringBuilder lettersBuilder = new StringBuilder();

        String[] blocks = numOfDoc.split("-");
        for (String block : blocks) {
            for (char c : block.toCharArray()) {
                if (Character.isLetter(c)) {
                    lettersBuilder.append(Character.toLowerCase(c));
                }
            }
        }

        lettersBuilder.insert(3, "/");
        lettersBuilder.insert(7, "/");
        lettersBuilder.insert(9, "/");

        System.out.println(lettersBuilder);
    }

    //Вывести на экран буквы из номера документа в формате
    //"Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
    //класса StringBuilder).
    public static void lettersOfNumUp(String numOfDoc){
        System.out.println("\nYYY/YYY/Y/Y: ");
        StringBuilder lettersBuilder = new StringBuilder();

        String[] blocks = numOfDoc.split("-");
        for (String block : blocks) {
            for (char c : block.toCharArray()) {
                if (Character.isLetter(c)) {
                    lettersBuilder.append(Character.toUpperCase(c));
                }
            }
        }

        lettersBuilder.insert(3, "/");
        lettersBuilder.insert(7, "/");
        lettersBuilder.insert(9, "/");

        System.out.println(lettersBuilder);
    }

    //Проверить содержит ли номер документа последовательность abc и
    //вывеcти сообщение содержит или нет(причем, abc и ABC считается
    //одинаковой последовательностью).
    public static void isABC(String numOfDoc){
        String smallNumDoc = numOfDoc.toLowerCase();

        if (smallNumDoc.contains("abc")) {
            System.out.println("\ncontains 'abc'.");
        } else {
            System.out.println("\ndoes not contain 'abc'.");
        }
    }

    //Проверить начинается ли номер документа с последовательности
    //555.
    public static void is555(String numOfDoc){
        //System.out.println("\nStarts with '555': ");

        if (numOfDoc.startsWith("555")) {
            System.out.println("starts with '555'.");
        } else {
            System.out.println("does not start with '555'.");
        }
    }

    //проверить заканчивается ли номер документа на
    //последовательность 1a2b.
    public static void ends1a2b(String numOfDoc){
        //System.out.println("\nEnds with '1a2b': ");

        if (numOfDoc.endsWith("1a2b")) {
            System.out.println("ends with '1a2b'.");
        } else {
            System.out.println("does not end with '1a2b'.");
        }
    }
}
