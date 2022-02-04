package com.spring.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// Create an array of strings
	private String[] data = {
			"Solitude is bliss",
			"God is dead",
			"Make your own luck, maybe?"
	};
	
	// Create a random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		// Pick random string from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
