package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class KhoKhoCoach implements Coach {

	@Override
	public String getDaliyWorkout() {
		return "Play langdi for 30 min and 10 Round around the poll";
	}

}
