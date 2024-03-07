
/*
1. Создайте класс Phone, который содержит переменные number, model и weight.
2. Создайте три экземпляра этого класса.
3. Выведите на консоль значения их переменных.
4. Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
5. Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
6. Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
7. Добавить конструктор без параметров.
8. Вызвать из конструктора с тремя параметрами конструктор с двумя.
9. Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
10. Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
*/

public class Phone {
    private int number;
    private String model;
    private float weight;
    public Phone() {
    }
    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(int number, String model, float weight) {
        this(number, model);
        this.weight = weight;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    int getNumber(){
        return number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    public void receiveCall(String name){
        System.out.println(name + " is calling");
    }
    public void receiveCall(String name, int number){
        System.out.println(name + " : " + number + " calling ");
    }
    void sendMessage (int ... nums){
        System.out.println("sending to...");
        for(int num : nums){
            System.out.println(num);
        }
    }
    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
