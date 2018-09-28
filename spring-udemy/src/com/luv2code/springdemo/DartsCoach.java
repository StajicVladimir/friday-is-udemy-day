package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DartsCoach implements Coach{

	public String getDailyWorkout() {
		return "Get one more Beer!";
	}

	public String getDailyfortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
