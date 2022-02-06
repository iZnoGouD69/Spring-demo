package com.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.basic.Coach;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// Load Spring Configuration File
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("annotations-applicationContext.xml");
		
		// Retrieve Bean from Spring Container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		// Check if both are same
		boolean isSame = (theCoach == alphaCoach);
		
		// Print result
		System.out.println("Pointing to the same object " + isSame);
		
		System.out.println("Memory location for theCoach is "  + theCoach);
		
		System.out.println("Memory location for alphaCoach is " + alphaCoach);
		
		// Close Context
		context.close();
	}

}
