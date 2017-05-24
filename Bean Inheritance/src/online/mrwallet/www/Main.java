package online.mrwallet.www;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		Message msg = (Message) applicationContext.getBean("message");
		System.out.println(msg.getMessage());
		System.out.println(msg.getMessage1());

		MessageChild msgChild = (MessageChild) applicationContext.getBean("messageChild");
		//since message is not passed, it will pick this value from its super bean defined in XML hence will print 'Parent Message'
		//while message 1 has been modified by child bean
		//and message 2 was added by child message
		System.out.println(msgChild.getMessage());
		System.out.println(msgChild.getMessage1());
		System.out.println(msgChild.getMessage2());
		

	}

}
