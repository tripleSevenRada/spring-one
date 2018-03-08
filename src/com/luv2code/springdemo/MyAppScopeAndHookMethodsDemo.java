package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppScopeAndHookMethodsDemo {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aplicationContextScopeAndHookMethodsDemo.xml");
		
		// singleton is the default scope
		Coach mySingletonCoach1 = context.getBean("cricketCoachSingleton", Coach.class);
		System.out.println("cricket coach demo scopes Si1: " + mySingletonCoach1.hashCode());
		Coach mySingletonCoach2 = context.getBean("cricketCoachSingleton", Coach.class);
		System.out.println("cricket coach demo scopes Si2: " + mySingletonCoach2.hashCode());
		System.out.println("singleton scope equals = " + (mySingletonCoach1 == mySingletonCoach2));
		
		//also test init and destroy method hooks
		Coach myPrototypeCoach1 = context.getBean("cricketCoachPrototype", Coach.class);
		System.out.println("cricket coach demo scopes Pr1: " + myPrototypeCoach1.hashCode());
		Coach myPrototypeCoach2 = context.getBean("cricketCoachPrototype", Coach.class);
		System.out.println("cricket coach demo scopes Pr2: " + myPrototypeCoach2.hashCode());
		System.out.println("prototype scope equals = " + (myPrototypeCoach1 == myPrototypeCoach2));
		
		
		context.close();
		
	}

}
