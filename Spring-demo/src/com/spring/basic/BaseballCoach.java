package com.spring.basic;

public class BaseballCoach implements Coach {

	// Depend a private field for dependency 
	private FortuneService fortuneService;
	
	// Inject Dependency using Constructor
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Hit as hard as you can";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
