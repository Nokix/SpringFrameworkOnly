package de.reichert;

import org.springframework.stereotype.Component;

//@Component
public class Doctor implements Staff{

    @Override
    public void assist() {
        System.out.println("Doctor is assisting.");
    }
}
