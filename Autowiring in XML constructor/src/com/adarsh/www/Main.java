package com.adarsh.www;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		HellpSpring hellpSpring=(HellpSpring) applicationContext.getBean("helloSpring");
		System.out.println(hellpSpring.getMessage());
		System.out.println(hellpSpring.getMessageType().getMessageType());
	}
}
