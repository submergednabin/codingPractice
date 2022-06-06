package com.test.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.test.models.Employees;

@Component
@Aspect
public class LoggingAspect {

	
	private static Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
	
//	@Pointcut("execution(* com.test.controllers.EmployeeController.*(..))")
//	public void loggingPointCut() {
//		
//	}
	
//	@Before("loggingPointCut()")
//	public void before( JoinPoint joinpoint) {
//		logger.info("Before method invoked::" + joinpoint.getSignature());
//	}
//	
//	@After("loggingPointCut()")
//	public void after(JoinPoint joinpoint) {
//		logger.info("After method invoked::" + joinpoint.getSignature());
//	}
	
	@AfterReturning(value = "execution(* com.test.controllers.*.*(..))" , returning = "employee" )
	public void after(JoinPoint joinPoint, Employees employee) {
		logger.info("After method invoked::" + employee);
	}
	
	@AfterThrowing(value = "execution(* com.test.controllers.*.*(..))" , throwing = "e" )
	public void after(JoinPoint joinPoint,Exception e) {
		logger.info("After method invoked::" + e.getMessage());
	}
}
