package TheFirstTask;

import java.util.Scanner;

/**
 * Дехтерёнок Кирилл
 */

/*
Задача 1:
Создать программу для имитации работы клиники. Пусть в клинике будет три врача:
хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но каждый врач лечит
по-своему. Так же предусмотреть класс «Пациент» с полем «План лечения» и полем
«Доктор». Создать объект класса «Пациент» и добавить пациенту план лечения. У
терапевта создать метод, который будет назначать врача пациенту согласно плану
лечения:
Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
Если план лечения имеет любой другой код – назначить терапевта и выполнить метод
лечить.
 */

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Добро пожаловать!");

        Therapist mainTherapist = new Therapist();

        System.out.println("Введите план лечения для пациента 1: ");
        int patientPlan1 = sc.nextInt();
        Patient patient1 = new Patient(patientPlan1);  // К хирургу

        System.out.println("Введите план лечения для пациента 2: ");
        int patientPlan2 = sc.nextInt();
        Patient patient2 = new Patient(patientPlan2);// К дантисту

        System.out.println("Введите план лечения для пациента 3: ");
        int patientPlan3 = sc.nextInt();
        Patient patient3 = new Patient(patientPlan3);  // К терапевту

        System.out.println("Пациент 1");
        mainTherapist.appointDoctor(patient1);

        System.out.println("\nПациент 2");
        mainTherapist.appointDoctor(patient2);

        System.out.println("\nПациент 3");
            mainTherapist.appointDoctor(patient3);
    }
}
