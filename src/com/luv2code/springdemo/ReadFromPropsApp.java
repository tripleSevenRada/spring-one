package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReadFromPropsApp {

	public static void main(String[] args) {
    
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aplicationContext.xml");
		Coach wiredCoach = context.getBean("toPropsWiredCoach", Coach.class);
		System.out.println("wiredCoach configured from props " + wiredCoach.getDailyWorkout());
        
		Coach randomizedCoach = context.getBean("randomCoach",Coach.class);
		
		for(int i = 0; i < 20; i ++){
			System.out.println("random fortune " + randomizedCoach.getDailyWorkout());
		}
		
		
		context.close();
	}

}
