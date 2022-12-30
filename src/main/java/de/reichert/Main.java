package de.reichert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(BeanConfig.class);
        //         = new ClassPathXmlApplicationContext("spring.xml");

        Doctor doctor = applicationContext.getBean(Doctor.class);
        doctor.assist();
    }
}
