package de.reichert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(BeanConfig.class);

        Doctor doctor = applicationContext.getBean(Doctor.class);
        doctor.assist();
        doctor.setName("Karl");
        doctor.assist();
        Doctor doctor1 = applicationContext.getBean(Doctor.class);
        doctor1.assist();



    }
}
