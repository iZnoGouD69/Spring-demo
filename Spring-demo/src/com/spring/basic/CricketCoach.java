package com.spring.basic;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneSerivce;
	
	// new fields
	private String emailAddress;
	private String team;

	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach email setter in use");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach team setter in use");
		this.team = team;
	}

	
	// no-arg constructor 
	public CricketCoach() {
		System.out.println("CricketCoach constructor in use");
	}
 
	// Setter method called by Spring for Injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach setter method in use");
		this.fortuneSerivce = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice makes perfect";
	}

	@Override
	public String getDailyFortune() {
		return fortuneSerivce.getFortune();
	}
	
	
	

}
