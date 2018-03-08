package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	FortuneService service;
	String injectedValue;
	
	public CricketCoach (){}
	
	@Override
	public String getDailyWorkout() {
        
		return "Cricket practise and " + service.getFortune();
	}

	public void setInjectedValue(String injectedValue) {
		this.injectedValue = injectedValue;
	}
	
	String getInjectedValue(){return injectedValue;}
	
	public void setFortuneService(FortuneService service){this.service = service;}
	
}
