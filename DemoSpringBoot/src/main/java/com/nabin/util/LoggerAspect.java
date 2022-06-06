package com.nabin.util;

import java.text.DateFormat;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.nabin.dto.CustomerDTO;

@Component
@Aspect
public class LoggerAspect {
	
	private static Logger logger = LoggerFactory.getLogger(LoggerAspect.class);
	
	@AfterThrowing("execution(* com.practice.service.CustomerServiceImpl.fetchCustomer(..))")
	public void logAfterThrowingAdvice(JoinPoint joinPoint) {
		
		logger.info("In After throwing advice, jointpoint signature:{}", joinPoint.getSignature() );
	}
	
	@AfterThrowing(pointcut="execution(* com.nabin.service.CustomerServiceImpl.fetchCustomer(..))")
	public void logAfterThrowingDetails(JoinPoint jointPoint, Exception exception) {
		logger.info("In After throwing Advice, Joinpoint signature:{}", jointPoint.getSignature());
		logger.error(exception.getMessage(), exception);
	}
	
	@Before("execution(* com.nabin.service.CustomerServiceImpl.fetchCustomer(..))")
	public void logBeforeAdvice(JoinPoint joinPoint) {
		//Log JoinPoint signature details
		logger.info("In Before Advice, Joinpoint signature : {}", joinPoint.getSignature());
		long time = System.currentTimeMillis();
		String date = DateFormat.getDateTimeInstance().format(time);
		logger.info("Report generated at time {}", date);
	}
	
	@AfterReturning(pointcut="execution(* com.nabin.service.CustomerServiceImpl.fetchCustomer(..))")
	public void logAfterReturningAdvice(JoinPoint joinPoint) {
		logger.info("In AfterReturning Advice, JoinPoint signature :{}", joinPoint.getSignature());
		
	}
	
	@AfterReturning(pointcut="execution(* com.nabin.service.CustomerServiceImpl.fetchCustomer(..))", returning = "result")
	public void logAfterReturningDetails(JoinPoint joinPoint, List<CustomerDTO> result) {
		logger.info("In AfterReturning Advice with return value, Joinpoint signature :{}", joinPoint.getSignature());
		System.out.println(result);
		long time = System.currentTimeMillis();
		String date = DateFormat.getDateTimeInstance().format(time);
		logger.info("Report generated at time: {}", date);
	}
	
	@Around("execution(* com.nabin.service.CustomerServiceImpl.fetchCustomer(..))")
	public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("Before proceeding part of the Around advice");
		Object cust = joinPoint.proceed();
		System.out.println("After proceeding part of the Around advice");
		return cust;
	}
}

