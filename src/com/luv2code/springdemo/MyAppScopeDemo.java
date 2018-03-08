package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppScopeDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aplicationContextScopeDemo.xml");
		Coach mySingletonCoach1 = context.getBean("cricketCoachSingleton", Coach.class);
		System.out.println("cricket coach demo scopes Si1: " + mySingletonCoach1.hashCode());
		Coach mySingletonCoach2 = context.getBean("cricketCoachSingleton", Coach.class);
		System.out.println("cricket coach demo scopes Si2: " + mySingletonCoach2.hashCode());
		// singleton is the default scope
		Coach myPrototypeCoach1 = context.getBean("cricketCoachPrototype", Coach.class);
		System.out.println("cricket coach demo scopes Pr1: " + myPrototypeCoach1.hashCode());
		Coach myPrototypeCoach2 = context.getBean("cricketCoachPrototype", Coach.class);
		System.out.println("cricket coach demo scopes Pr2: " + myPrototypeCoach2.hashCode());
		context.close();
		
	}

}
