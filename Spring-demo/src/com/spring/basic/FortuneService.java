package com.spring.basic;

public interface FortuneService {

	/* Dependency Injection : -
	 * Here we are going to inject this FortuneService dependency
	 * which will be a service supported by our Coach
	 */
	public String getFortune();
}
