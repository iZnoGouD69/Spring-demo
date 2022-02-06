package com.spring.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.basic.Coach;

public class SwimJavaConfigDemoApp {

		public static void main(String[] args) {
			
			// Read Spring Configuration file but this time using Java
			AnnotationConfigApplicationContext context = 
					new AnnotationConfigApplicationContext(SportConfig.class);
			
			// Get the Bean from Spring Container
			//Coach theCoach = context.getBean("CoachComponent", Coach.class);
			SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
			
			// Call methods on Bean
			System.out.println(theCoach.getDailyWorkout());
			
			// Call new method after Auto-wiring
			System.out.println(theCoach.getDailyFortune());
			
			// Call new methods from SwimCoach
			System.out.println("Email - " + theCoach.getEmail());
			System.out.println("Team - " + theCoach.getTeam());
			
			// Close the Context
			context.close();

		}

	}


