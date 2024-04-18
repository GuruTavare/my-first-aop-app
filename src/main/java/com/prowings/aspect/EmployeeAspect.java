package com.prowings.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.prowings.beans.MyLogger;

@Component
@Aspect
public class EmployeeAspect {

//	@Autowired
//	MyLogger logger;

	@Before("execution(* com.prowings.beans.Employee.*(..))")
	public void logBefore(JoinPoint joinpoint)throws Throwable {
		System.out.println(">>>>>>>> Before");
	}

	@After("execution(* com.prowings.beans.Employee.*(..))")
	public void logAfter(JoinPoint joinpoint)throws Throwable {
		System.out.println(">>>>>>>> after");
	}

}
