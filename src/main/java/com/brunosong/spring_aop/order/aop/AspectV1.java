package com.brunosong.spring_aop.order.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Slf4j
@Aspect
public class AspectV1 {

    @Around("execution(* com.brunosong.spring_aop.order..*(..))")
    public Object doLog(ProceedingJoinPoint joinPoint) throws Throwable {

        log.info("joinPoint = {}", joinPoint.getSignature());
        return joinPoint.proceed();

    }


}
