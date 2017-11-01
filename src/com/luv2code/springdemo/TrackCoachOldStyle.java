package com.luv2code.springdemo;

public class TrackCoachOldStyle implements Coach {

	private int duration = 60;
	
	@Override
	public String getDailyWorkout() {
		return "run until exhaustion and even more for " + getMyProperty() + " min.";
	}

	public void setMyProperty(int duration){this.duration = duration;}
	public int getMyProperty(){return duration;}
}
