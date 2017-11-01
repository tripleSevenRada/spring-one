package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		Coach theBaseballCoach = new BaseballCoach();
		System.out.println("direct " + theBaseballCoach.getDailyWorkout());

		Coach theTrackCoach = new TrackCoach();
		System.out.println("direct " + theTrackCoach.getDailyWorkout());
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aplicationContext.xml");
		
		Coach myCoach = context.getBean("trackCoach",Coach.class);
		
		System.out.println("spring " + myCoach.getDailyWorkout());
		
		Coach myFortuneTellingCoach = context.getBean("fortuneTellingCoach",Coach.class);
		
		System.out.println("spring DI "+ myFortuneTellingCoach.getDailyWorkout());
		
		CricketCoach myCricketCoach = context.getBean("cricketCoach",CricketCoach.class);//name, class<T> required class
		
		System.out.println("setter DI " + myCricketCoach.getDailyWorkout() );
		System.out.println("setter DI " + myCricketCoach.getInjectedValue() );
		
		context.close();
	
		 
	}
}
