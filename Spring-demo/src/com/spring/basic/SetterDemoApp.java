package com.spring.basic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		// Load the Spring Configuration File
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve Bean from Spring Container
		/*
		 * The important thing to notice here is that we are using CricketCoach
		 * Class here instead of Coach Interface because Interface don't have 
		 * access to EmailAddress and Team while its implementaion does
		 */
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
	
		// Call method on Bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// Calling new methods with literal injection
		/*
		 * Literal Injection are still hard coded in configuration file
		 * Solution - We can make Spring read values from properties file
		 */
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		// Close the Context
		context.close();

	}

}
