package com.practice.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerAspect {
	
	private static Logger logger = LoggerFactory.getLogger(LoggerAspect.class);
	
	@AfterThrowing("execution(*com.practice.service.CustomerServiceImpl.fetchCustomer(..)")
	public void logAfterThrowingAdvice(JoinPoint joinPoint) {
		
		logger.info("In After throwing advice, jointpoint signature:{}", joinPoint.getSignature() );
	}
	
	@AfterThrowing(pointcut="execution(*com.practice.service.CustomerServiceImpl.fetchCustomer(..))")
	public void logAfterThrowingDetails(JoinPoint jointPoint, Exception exception) {
		logger.info("In After throwing Advice, Joinpoint signature:{}", jointPoint.getSignature());
		logger.error(exception.getMessage(), exception);
	}
}
