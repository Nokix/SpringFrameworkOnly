package de.reichert.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class MainAOP {
    public static void main(String[] args) {
        ConfigurableApplicationContext context
                = new AnnotationConfigApplicationContext(MainAOP.class);

        Item item0 = new Item("Böller", 120);
        Item item1 = new Item("Rakete", 500);

        ShoppingCart shoppingCart = context.getBean(ShoppingCart.class);
        shoppingCart.addItem(item0);
        shoppingCart.checkout();
        shoppingCart.addItem(item0);
        shoppingCart.checkout();
        shoppingCart.addItem(item1);
        shoppingCart.checkout();
        shoppingCart.removeItem(item0);
        shoppingCart.checkout();

        Binomial binomial = context.getBean(Binomial.class);

        System.out.println(binomial.nOverK(10, 5));


    }
}
