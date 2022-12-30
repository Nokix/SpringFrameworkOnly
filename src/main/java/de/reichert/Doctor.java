package de.reichert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Doctor implements Staff{

    @Autowired
    private Nurse nurse;

    @Override
    public void assist() {
        System.out.println("Doctor is assisting.");
        nurse.assist();
    }
}
