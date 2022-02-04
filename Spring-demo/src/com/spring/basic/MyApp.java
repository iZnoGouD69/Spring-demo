package com.spring.basic;

public class MyApp {

	public static void main(String[] args) {
		BaseballCoach theCoach = new BaseballCoach(null);
		
		System.out.println(theCoach.getDailyWorkout());
	}

}
