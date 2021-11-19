package com.example.events.aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ApiCallListener {


    @Around("@annotation(LogApiCall)")
    public Object logApiCall(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Api called.");
        return joinPoint.proceed();
    }

}
