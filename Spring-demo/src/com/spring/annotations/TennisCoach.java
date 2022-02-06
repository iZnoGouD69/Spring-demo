package com.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.spring.basic.Coach;

/*
 * Default Bean-id is generated and its name is as same as class name
 * with first letter in lower in case i.e. tennisCoach for here
 */
//@Component("CoachComponent")
@Component

@Scope("prototype")
/*
 * Default is singleton where bean is shared while we 
 * use prototype to generate new bean for every object
 */
public class TennisCoach implements Coach {

	// Field Injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	// Define a default constructor
	public TennisCoach() {
		System.out.println("Tennis Coach constructor in use");
	}
	
	
	/*
	 * Setter Injection
	 *
	 Define a setter method for FortuneService
	@Autowired
	public void setFourtuneService(FortuneService theFortuneSerivce) {
		System.out.println("Tennis Coach Setter method in use");
		this.fortuneService = theFortuneSerivce;
	}*/
	
	
	/*
	 * Helps us automatically look for the implementation of
	 * FortuneService - Constructor Injection
	 * 
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() {
		return "Avoid the net as much as you can";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
