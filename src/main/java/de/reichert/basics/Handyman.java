package de.reichert.basics;

import org.springframework.stereotype.Component;

@Component
public class Handyman implements Staff{
    @Override
    public void assist() {
        System.out.println("Handyman is assisting.");
    }
}
