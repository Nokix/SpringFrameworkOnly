package de.reichert.basics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(BeanConfig.class);

        Doctor doctor = applicationContext.getBean(Doctor.class);
        doctor.assist();
        ((ConfigurableApplicationContext) applicationContext).close();
    }
}
