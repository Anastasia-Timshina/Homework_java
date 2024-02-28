/*4. Дана строка: Плохой день.

Необходимо с помощью метода substring удалить
слово "плохой". После чего необходимо используя
команду insert создать строку со значением: Хороший день!!!!!!!!!.

Заменить последний "!" на "?"*/
public class FourthTask {
    void replaceDay(){
        String badStr = "Плохой день";

        String bad = "Плохой";
        int beginInd = 0;
        int endInd = beginInd + bad.length();
        String str = badStr.substring(endInd);

        StringBuilder goodStr = new StringBuilder(str);
        goodStr.insert(beginInd, "Хороший");
        goodStr.append("!!!!!!!!!");

        int lastedIndexOf = goodStr.lastIndexOf("!");
        if (lastedIndexOf != -1) {
            goodStr.setCharAt(lastedIndexOf, '?');
        }

        System.out.println(goodStr);
    }
}
