package Clinics;
/*4. Создать программу для имитации работы клиники.
Пусть в клинике будет три врача: хирург, терапевт и дантист.
Каждый врач имеет метод «лечить», но каждый врач лечит по-своему.
Так же предусмотреть класс «Пациент» и класс «План лечения».
Создать объект класса «Пациент» и добавить пациенту план лечения.
Так же создать метод, который будет назначать врача пациенту согласно плану лечения.
Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
Если план лечения имеет любой другой код – назначить терапевта и выполнить метод лечить. */
public class Runner {
    public static void main(String[] args) {

        System.out.println("Welcome to our clinics!");

        TreatmentPlan plan1 = new TreatmentPlan(1);
        TreatmentPlan plan2 = new TreatmentPlan(2);
        TreatmentPlan plan3 = new TreatmentPlan(3);

        Patient patient1 = new Patient("Иван", plan1);
        Patient patient2 = new Patient("Мария", plan2);
        Patient patient3 = new Patient("Алексей", plan3);

        patient1.assignDoctor();
        patient2.assignDoctor();
        patient3.assignDoctor();
    }
}
