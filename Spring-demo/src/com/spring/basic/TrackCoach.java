package com.spring.basic;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run as fast you can";
	}
	@Override
	public String getDailyFortune() {
		return "Just do it " + fortuneService.getFortune();
	}
	
	// Add an init method
	public void doStartupStuff() {
		System.out.println("This method id called during initalization of bean");
	}
	
	// Add a destroy method
	public void doShutdownStuff() {
		System.out.println("This method is called before bean is destroyed");
	}

}
