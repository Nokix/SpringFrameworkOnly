package de.reichert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public Doctor doctor(Nurse nurse) {
        return new Doctor(nurse);
    }

    @Bean
    public Nurse nurse() {
        return new Nurse();
    }
}
