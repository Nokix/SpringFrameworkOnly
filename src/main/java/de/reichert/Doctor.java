package de.reichert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Doctor implements Staff{

    @Value("${system}")
    private String name;

    @Override
    public void assist() {
        System.out.println("Doctor "+ name +" is assisting.");
    }
}
