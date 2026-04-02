package TheFirstTask;

import javax.print.Doc;

public class Therapist implements Doctor {
    @Override
    public void treat() {
        System.out.println("Терапевт проводит общий осмотр и назначаю лекарства.");
    }

    public void appointDoctor(Patient patient){
        System.out.println("Вызван метод appointDoctor() у Терапевта для распределения пациента.");

       switch(patient.getPlan()){
           case 1: {
               patient.setDoctor(new Surgeon());
               break;
           }
           case 2:{
               patient.setDoctor(new Dentist());
               break;
           }
           default:{
               patient.setDoctor(new Therapist());
               break;
           }
       }

        System.out.print("Назначен врач " + patient.getDoctor().getClass().getSimpleName() + ". Процесс лечения: ");
       patient.getDoctor().treat();
    }

}
