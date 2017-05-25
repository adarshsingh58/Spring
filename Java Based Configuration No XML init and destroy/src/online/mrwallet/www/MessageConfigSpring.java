package online.mrwallet.www;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*This @configuration tells us that this class is equivalent to Spring XML.
 *  All mehods annoted with @Bean will be equivalet to <bean> tag in XML */
@Configuration
public class MessageConfigSpring {

	/**
	 * @Bean tells that this methos is bean definition and return type is the
	 *       type of Bean object that will be returned with metjod name as the
	 *       bean id. This is equivalent to 
	 *       {
	 *       <bean id="getMessage" class="online.mrwallet.www.Message" init-method="initBean" destroy-method="destroyBean">
	 *       <property name="message" value="Hello Spring"/>
	 *       <property name="messageType" ref="getMessageType"/></bean>
	 *       }
	 */
	@Bean(initMethod="initBean", destroyMethod="destroyBean")
	public Message getMessage() {
		Message message = new Message();
		message.setMessage("Hello Spring");
		message.setMessageType(getMessagetype());
		return message;
	}

	/**
	 * This is equivalent to 
	 *       {
	 *       <bean id="getMessagetype" class="online.mrwallet.www.MessageType">
	 *       <property name="messageType" value="Text Message"></bean>
	 *       }
	 */
	@Bean
	public MessageType getMessagetype() {
		MessageType messageType = new MessageType();
		messageType.setMessageType("Text message");
		return messageType;
	}
	
	
}
