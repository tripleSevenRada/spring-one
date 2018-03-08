package com.luv2code.springdemo;

public class ToPropsWiredCoach implements Coach
{

	private String prop1, prop2;
	private FortuneService fortuneService;
	
	/**
	 * @return the service
	 */
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	/**
	 * @param service the service to set
	 */
	public void setFortuneService(FortuneService service) {
		this.fortuneService = service;
	}

	@Override
	public String getDailyWorkout() {
		return fortuneService.getFortune() + prop1 + prop2;
	}

	public String getProp1() {
		return prop1;
	}

	public void setProp1(String prop1) {
		this.prop1 = prop1;
	}

	public String getProp2() {
		return prop2;
	}

	public void setProp2(String prop2) {
		this.prop2 = prop2;
	}

}
