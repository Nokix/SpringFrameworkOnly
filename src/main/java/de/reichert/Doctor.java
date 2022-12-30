package de.reichert;

public class Doctor {
    Qualification qualification;

    public Doctor() {
    }

    public Doctor(Qualification qualification) {
        this.qualification = qualification;
    }

    public void assist() {
        System.out.println("Doctor is assisting");
    }
}
