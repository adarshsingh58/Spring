package online.mrwallet.www;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		Message msg = (Message) applicationContext.getBean("message");
		System.out.println(msg.getMessage());
		System.out.println(msg.getMessageType().getMessageType());
	}

}
