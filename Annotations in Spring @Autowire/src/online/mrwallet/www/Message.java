package online.mrwallet.www;

import org.springframework.beans.factory.annotation.Autowired;

public class Message {

	
	private String message;
	
	/* Here we Autowired MessageType so it will do same as writing 'autowire="byName"' in XML */	
	@Autowired
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

	

	
	

}
