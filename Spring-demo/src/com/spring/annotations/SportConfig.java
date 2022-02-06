package com.spring.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.spring.basic.Coach;

/*
 * How to implement Spring Configuration without the use of XML
 * @Configration annotation allows us to do that
 */
@Configuration
//@ComponentScan("com.spring.annotations")

/*
 * Used for field injection from a property file
 */
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	// Define bean for SadFortuneService
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// Define bean for SwimCoach and inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	

}
