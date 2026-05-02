package Task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentProcessor {
    public static void processStudents(ArrayList<Student> students){
        Iterator<Student> iter = students.iterator();

        while (iter.hasNext()){
            Student student = iter.next();
            double avgMark = student.getAverageMark();

            if(avgMark < 3){
                System.out.println("Отчислен: " + student.getName() + "(средний балл: " + String.format("%.2f", avgMark) + ")");
                iter.remove();
            }else{
                int nextCourse = student.getCourse() + 1;
                student.setCourse(nextCourse);
                System.out.println(student.getName() + " переведен на " + nextCourse + "курс.");
            }
        }
    }

    public static void printStudents(List<Student> students, int course){
        System.out.println("\n=== Студенты " + course + " курса ===");

        boolean found = false;
        for(Student student : students){
            if(student.getCourse() == course){
                System.out.println(" - " + student.getName() +
                        " (группа: " + student.getGroup() + ")");
                found = true;
            }

        }

        if(!found){
            System.out.println("Студентов на " + course + " курсе не найдено");
        }
    }
}
