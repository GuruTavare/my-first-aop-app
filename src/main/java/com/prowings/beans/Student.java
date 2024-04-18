package com.prowings.beans;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	public void doHomeWork() {
		System.out.println("inside doHomeWork() ");
	}
	
	public void doDivision() {
		
		//int res=11/0;
		
		System.out.println("inside doDivision() ");
	}

}
