package com.spring.basic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {

	public static void main(String[] args) {
		
		// Load the Spring Configuration File
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// Retrieve Bean from Spring Container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
	
		
		// Close the context
		context.close();

	}

}
