package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringAnnotationDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext CPXApplicationContext = new ClassPathXmlApplicationContext("applicationContext-springAnnotation.xml");
		
														// __KabbdiCoach is explicit Component/Bean name check file KabbdiCoach.java Comment #-1
		Coach kabbdiCoach = CPXApplicationContext.getBean("__KabbdiCoach",Coach.class);
		System.out.println(kabbdiCoach.getDaliyWorkout());
														// khokhoCoach is default Component/Bean name
		Coach khokhoCoach = CPXApplicationContext.getBean("khoKhoCoach",Coach.class);
		System.out.println(khokhoCoach.getDaliyWorkout());

	}

}
