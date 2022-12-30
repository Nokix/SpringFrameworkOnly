package de.reichert;

public class Doctor implements Staff{
    private String  qualification;
    private Nurse nurse;

    public Doctor(String qualification, Nurse nurse) {
        this.qualification = qualification;
        this.nurse = nurse;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public String getQualification() {
        return qualification;
    }

    @Override
    public void assist() {
        System.out.println("Doctor is assisting.");
        nurse.assist();
    }
}
