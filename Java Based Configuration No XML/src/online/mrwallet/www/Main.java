package online.mrwallet.www;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
//		For Java based annotation classes we use AnnotationConfigApplicationContext
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MessageConfigSpring.class);

		Message msg = applicationContext.getBean(Message.class);
		System.out.println(msg.getMessage());
		System.out.println(msg.getMessageType().getMessageType());
	}

}
