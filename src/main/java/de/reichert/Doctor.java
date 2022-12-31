package de.reichert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Doctor implements Staff{
    private String name;

    @Autowired
    private Staff handyman;
    // private Staff staff // Führt zu Fehler

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void assist() {
        System.out.println("Doctor "+ name +" is assisting.");
        handyman.assist();
    }
}
