package com.prowings.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class StudentAspect {

//	@Before("execution(* com.prowings.beans.Student.*(..))")
//	public void logBefore(JoinPoint joinPoint) {
//		System.out.println(">>>Before");
//		
//	}

//	@AfterThrowing("execution(* com.prowings.beans.Student.*(..))")
//	public void logAfter(JoinPoint joinPoint) {
//		System.out.println("<<<After");
//	}
//	@AfterReturning("execution(* com.prowings.beans.Student.*(..))")
//	public void logAfter(JoinPoint joinPoint) {
//		System.out.println("<<<After");
//	}
//	@After("execution(* com.prowings.beans.Student.*(..))")
//	public void logAfter(JoinPoint joinPoint) {
//		System.out.println("<<<After");
//	}

//	@Around("execution(* com.prowings.beans.Student.*(..))")
	@Around("within(com.prowings.beans.Student)")

	// ProceedingJoinPoint only applicable for @Around advice

	public void logBeforeAfter(ProceedingJoinPoint joinPoint) {
		System.out.println(">> BeforeAfter <<");
		 Object returnedValue =null;
		try {
			returnedValue=joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}

		 System.out.println(returnedValue);
		System.out.println(">> BeforeAfter <<");
	}

}
