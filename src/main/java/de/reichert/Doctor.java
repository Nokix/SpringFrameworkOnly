package de.reichert;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("arzt")
public class Doctor implements Staff, BeanNameAware {

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean name is: " + name);
    }

    @Value("${system}")
    private String name;

    @Override
    public void assist() {
        System.out.println("Doctor "+ name +" is assisting.");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Doctor created with name: " + name);
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("soon, i will be gone.");
    }
}
