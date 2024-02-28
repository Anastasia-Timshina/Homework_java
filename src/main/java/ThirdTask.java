/*Дана строка: teamwithsomeofexcersicesabcwanttomakeitbetter.

Необходимо найти в данной строке "abc", записав всё
что до этих символов в первую переменную, а также всё, что после них во вторую.

Результат вывести в консоль. */
public class ThirdTask {
    void findABC(){
        String str = "teamwithsomeofexcersicesabcwanttomakeitbetter";

        int i = str.indexOf("abc");

        String s1 = str.substring(0, i);
        String s2 = str.substring(i+3);

        System.out.printf("Your str: %s\nYour s1: %s\nYour s2: %s", str, s1, s2);
    }
}
