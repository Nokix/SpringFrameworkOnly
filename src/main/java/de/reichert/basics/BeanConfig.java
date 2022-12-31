package de.reichert.basics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.beans.BeanProperty;

@Configuration
@ComponentScan
@PropertySource("spring.properties")
public class BeanConfig {

}
