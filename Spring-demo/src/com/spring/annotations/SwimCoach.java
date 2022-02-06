package com.spring.annotations;

import org.springframework.beans.factory.annotation.Value;

import com.spring.basic.Coach;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	// Injecting values to field from sports.properties
	@Value("${confi.email}")
	private String email;
	@Value("${confi.team}")
	private String team;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Swim like a dolphin";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	// Getters for email and team
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}

}
