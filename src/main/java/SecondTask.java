/*2. Используя метод вывода значения в консоль,
выполните конкатенацию слов и выведите на экран следующую фразу:

Welcome to the TMS lesons.

Каждое слово должно быть записано отдельно
и взято в кавычки, например "Welcome". Не забывайте о пробелах после каждого слова*/
public class SecondTask {
    void concat(){
        String s1 = "Welcome";
        String s2 = "to";
        String s3 = "the";
        String s4 = "TMS";
        String s5 = "lessons";

        String resStr = s1.concat(" ").concat(s2).concat(" ")
                .concat(s3).concat(" ").concat(s3).concat(" ")
                .concat(s4).concat(" ").concat(s5);

        System.out.println(resStr);
    }
}
