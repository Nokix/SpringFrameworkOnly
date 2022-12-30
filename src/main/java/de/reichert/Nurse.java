package de.reichert;

import org.springframework.stereotype.Component;


public class Nurse implements Staff{
    @Override
    public void assist() {
        System.out.println("Nurse is assisting.");
    }
}
