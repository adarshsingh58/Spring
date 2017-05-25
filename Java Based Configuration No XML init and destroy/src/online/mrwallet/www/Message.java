package online.mrwallet.www;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Message {

	private String message;
	private MessageType messageType;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MessageType getMessageType() {
		return messageType;
	}

	public void setMessageType(MessageType messageType) {
		this.messageType = messageType;
	}
	
	public void initBean()
	{
		System.out.println("After Initializtion");
	}
	
	public void destroyBean()
	{
		System.out.println("Before Destruction");
	}

}
