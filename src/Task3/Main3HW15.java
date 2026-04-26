package Task3;

/**
 * Дехтерёнок Кирилл
 */

import java.util.ArrayList;

/*
Задача 3:
Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
Написать метод, который удаляет студентов со средним баллом <3. Если средний
балл>=3, студент переводится на следующий курс. Дополнительно написать метод
printStudents(List<Student> students, int course), который получает список студентов и
номер курса. А также печатает на консоль имена тех студентов из списка, которые
обучаются на данном курсе.
 */

public class Main3HW15 {
    public static void main(String[] args){
        ArrayList<Student> students = new ArrayList<>();

        Student s1 = new Student("Иван", "Группа А", 1);
        s1.addMark(4); s1.addMark(5); s1.addMark(4);  // средний 4.3
        students.add(s1);

        Student s2 = new Student("Мария", "Группа Б", 1);
        s2.addMark(5); s2.addMark(5); s2.addMark(5);  // средний 5.0
        students.add(s2);

        Student s3 = new Student("Пётр", "Группа А", 2);
        s3.addMark(2); s3.addMark(2); s3.addMark(3);  // средний 2.3
        students.add(s3);

        Student s4 = new Student("Анна", "Группа Б", 2);
        s4.addMark(3); s4.addMark(3); s4.addMark(4);  // средний 3.3
        students.add(s4);

        System.out.println("=== НАЧАЛЬНОЕ СОСТОЯНИЕ ===");
        for(Student s : students){
            System.out.println(s);
        }

        System.out.println("\n=== ОБРАБОТКА СТУДЕНТОВ ===");
        StudentProcessor.processStudents(students);

        System.out.println("\n=== ПОСЛЕ ОБРАБОТКИ ===");
        for(Student s : students){
            System.out.println(s);
        }

        StudentProcessor.printStudents(students, 2);
        StudentProcessor.printStudents(students, 3);
    }
}
