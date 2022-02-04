package com.spring.basic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		
		// Load the Spring Configuration File
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// Retrieve Bean from Spring Container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// Check if these two Beans are same or not
		boolean isSameBean = (theCoach == alphaCoach);
		
		// Print result
		System.out.println("Pointing to the same object " + isSameBean);
		System.out.println("Memory location for theCoach is " + theCoach);
		System.out.println("Memory location for alphaCoach is " + alphaCoach);
		
		// Close the context
		context.close(); 

	}

}
