package com.luv2code.springdemo;

public class FortuneTellingCoach implements Coach {

	FortuneService service;
	
	public FortuneTellingCoach(FortuneService service){
	    this.service = service;	
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "daily workout + " + service.getFortune();
	}

}
