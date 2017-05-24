package online.mrwallet.www;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main{

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		Message message1 = (Message) applicationContext.getBean("message");
		message1.setMessage("First Object");
		System.out.println(message1.getMessage());

		//to end the IoC service we call registerShutdownHook() method
		//This method is availble with AbstractApplicationContext and not ApplicationContext
		applicationContext.registerShutdownHook();
	}

	
}
