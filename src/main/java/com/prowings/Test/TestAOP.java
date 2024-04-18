package com.prowings.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.prowings.beans.Employee;
import com.prowings.beans.Student;
import com.prowings.config.AppConfig;

public class TestAOP {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		Employee emp=context.getBean(Employee.class);
//		emp.work();
//		emp.getEmployeeId();
		
		Student std = context.getBean(Student.class);
		//std.doHomeWork();
		std.doDivision();
		
	}

}
