package online.mrwallet.www;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		Message msg = (Message) applicationContext.getBean("message");
		System.out.println(msg.getMessage());
		System.out.println(msg.getMessageType().getMessageType());
		applicationContext.registerShutdownHook();
	}

}
