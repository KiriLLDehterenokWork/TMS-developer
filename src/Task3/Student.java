package Task3;

import java.util.ArrayList;

public class Student {
    private String name;
    private String group;
    private int course;
    private ArrayList<Integer> marks;

    public Student(String name, String group, int course){
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void addMark(int mark){
        marks.add(mark);
    }


    public double getAverageMark() {
        if(marks.isEmpty()){
            return 0.0;
        }else{
            int sum = 0;
            for(int mark : marks){
                sum += mark;
            }
            return (double) sum / marks.size();
        }
    }

    @Override
    public String toString() {
        return name + " (группа: " + getGroup() +
                ", курс: " + getCourse() +
                ", средний балл: " + String.format("%.2f", getAverageMark()) + ")";
    }


}
