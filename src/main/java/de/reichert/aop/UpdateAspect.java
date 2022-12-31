package de.reichert.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UpdateAspect {
    @Pointcut("execution(* de.reichert.aop.ShoppingCart.*(Item))")
    public void updatablePointcut() {
    }

    @Pointcut("execution(* de.reichert.aop.ShoppingCart.update*())")
    public void updateFunctionPointcut() {

    }

    @After("updatablePointcut() && !updateFunctionPointcut()")
    public void update(JoinPoint joinPoint) {
        ShoppingCart shoppingCart = (ShoppingCart) joinPoint.getThis();
        shoppingCart.updateItemCount();
        shoppingCart.updatePrice();
    }
}
