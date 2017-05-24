package com.adarsh.www;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		HellpSpring hellpSpring=(HellpSpring) applicationContext.getBean("helloSpring");
		System.out.println(hellpSpring.getMessage());
		applicationContext.registerShutdownHook();
	}
}
