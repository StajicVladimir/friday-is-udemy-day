package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] data = {
			"Beware of dinosaurs!",
			"ha ha ha ",
			"blooop"
	};
	
	private Random myRandom = new Random();
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		
		return data[index];
	}

}
