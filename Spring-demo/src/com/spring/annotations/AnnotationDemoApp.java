package com.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.basic.Coach;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// Read Spring Config File
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("annotations-applicationContext.xml");
		
		// Get the Bean from Spring Container
		//Coach theCoach = context.getBean("CoachComponent", Coach.class);
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// Call methods on Bean
		System.out.println(theCoach.getDailyWorkout());
		
		// Call new method after Auto-wiring
		System.out.println(theCoach.getDailyFortune());
		
		// Close the Context
		context.close();

	}

}
