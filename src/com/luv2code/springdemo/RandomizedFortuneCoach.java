package com.luv2code.springdemo;

public class RandomizedFortuneCoach implements Coach {

	private FortuneService fortuneService;
	
	public void setFortuneService(FortuneService service) {
		this.fortuneService = service;
	}

	@Override
	public String getDailyWorkout() {
		return "this is just fortune, not workout " + fortuneService.getFortune();
	}

}
