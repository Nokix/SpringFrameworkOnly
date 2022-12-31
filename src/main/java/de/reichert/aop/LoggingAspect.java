package de.reichert.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("@annotation(Logged)")
    public void logging(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        System.out.println("Method called: " + signature);
    }

    @AfterReturning(value = "@annotation(Logged)", returning = "val")
    public void afterLogging(JoinPoint joinPoint, Object val) {
        if (val != null) System.out.println("Returning: " + val.toString());
    }
}
