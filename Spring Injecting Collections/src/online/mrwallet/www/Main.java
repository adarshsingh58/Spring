package online.mrwallet.www;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		Message message1 = (Message) applicationContext.getBean("message");
		System.out.println(message1.getListData());
		System.out.println(message1.getMapData());
		System.out.println(message1.getSetData());
		System.out.println(message1.getMessage());
		System.out.println(message1.getPropertiesData());
	}
}
