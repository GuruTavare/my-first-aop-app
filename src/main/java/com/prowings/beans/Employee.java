package com.prowings.beans;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	//MyLogger logger = new MyLogger();
	
	public void work() {
	//	logger.log("before work() logging");
		System.out.println("inside employee work()");
	//	logger.log("After work() logging");
	}

	
	public void getEmployeeId() {
		System.out.println("inside getEmployeeId()");
	}

}
