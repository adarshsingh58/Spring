package online.mrwallet.www;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		Message message1 = (Message) applicationContext.getBean("message");
		message1.setMessage("First Object");
		System.out.println(message1.getMessage());

		Message message2 = (Message) applicationContext.getBean("message");
		System.out.println(message2.getMessage());

		// even if the message is not second in second object you will get
		// "First Object" the second time because one object has already been created
		// and the secind one, hence, is retreing that single copy from cache and not a new ones		

	}
}
