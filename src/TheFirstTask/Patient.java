package TheFirstTask;

public class Patient {
    private int treatmentPlan;
    private Doctor doctor;

    public Patient(int plan){
        this.treatmentPlan = plan;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public int getPlan() {
        return treatmentPlan;
    }

    public void setPlan(int plan) {
        this.treatmentPlan = plan;
    }
}
