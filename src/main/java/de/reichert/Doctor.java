package de.reichert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Doctor implements Staff{

    private Nurse nurse;

    public Doctor(Nurse nurse) {
        this.nurse = nurse;
    }

    @Override
    public void assist() {
        System.out.println("Doctor is assisting.");
        nurse.assist();
    }
}
