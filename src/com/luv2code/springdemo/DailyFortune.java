package com.luv2code.springdemo;

public class DailyFortune implements FortuneService{

	@Override
	public String getFortune() {
		
		return "some random fortune value";
	}

}
