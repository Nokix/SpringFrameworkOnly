package de.reichert.aop;

import java.util.HashMap;
import java.util.Map;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CacheAspect {
    private Map<String, Object> cache = new HashMap<>();

    @Around("@annotation(Cached) && execution(* *.*(int, int))")
    public Object cacheMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("caching");
        String key = getCacheKey(joinPoint);
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        Object result = joinPoint.proceed();
        cache.put(key, result);
        return result;
    }

    private String getCacheKey(ProceedingJoinPoint joinPoint) {
        StringBuilder sb = new StringBuilder();
        sb.append(joinPoint.getSignature().toString());
        for (Object arg : joinPoint.getArgs()) {
            sb.append(arg);
        }
        return sb.toString();
    }
}
