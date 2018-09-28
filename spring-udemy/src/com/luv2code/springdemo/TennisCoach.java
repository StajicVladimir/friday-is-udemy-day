package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach(){
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	@PostConstruct
	public void doMyStartUpStuff(){
		System.out.println(">> TennisCoach: inside of dyMyStartUpStuff");
	}
	
	@PreDestroy
	public void doMyCleanUpStuff(){
		System.out.println(">> TennisCoach: inside of dyMyCleanupStuff");
	}
	
	/*@Autowired
	public void fooBar(FortuneService fortuneService){
		System.out.println(">> Tenniscoach: inside fooBar() method");
		this.fortuneService = fortuneService;
	}*/
	//@Autowired
	//public TennisCoach(FortuneService fortuneService){
   //	this.fortuneService = fortuneService;
	//}
	
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	public String getDailyfortune() {
		return fortuneService.getFortune();
	}

}
