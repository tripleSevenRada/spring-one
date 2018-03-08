package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortune implements FortuneService {

	private String[] fortunes = new String[]{"for one","for two","for three"};
	Random r = new Random();
	
	@Override
	public String getFortune() {
        int index = r.nextInt(3);
		return fortunes[index];
	}

}
