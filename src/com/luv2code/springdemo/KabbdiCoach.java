package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

/*
 * Comment #-1
 * Explicit Component/bean name is = "__KabbdiCoach"
 * 
 * */
@Component("__KabbdiCoach")
public class KabbdiCoach implements Coach {

	@Override
	public String getDaliyWorkout() {
		return "Do 3 sets of 10 push up every day";
	}

}
