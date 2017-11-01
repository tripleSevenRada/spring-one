package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	FortuneService service;
	String InjectedValue;
	


	public CricketCoach (){}
	
	@Override
	public String getDailyWorkout() {
        
		return "Cricket practise and " + service.getFortune();
	}

	public void setInjectedValue(String injectedValue) {
		InjectedValue = injectedValue;
	}
	
	String getInjectedValue(){return InjectedValue;}
	
	public void setFortuneService(FortuneService service){this.service = service;}
	
}
