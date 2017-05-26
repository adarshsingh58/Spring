package online.mrwallet.www;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		Message message=(Message) applicationContext.getBean("message");
		System.out.println(message.getMessage());
		
		System.out.println("on set");
		message.setMessage("New Message");
		
		System.out.println(message.getMessage());
	}

}
