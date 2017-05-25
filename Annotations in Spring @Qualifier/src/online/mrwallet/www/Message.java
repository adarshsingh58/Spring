package online.mrwallet.www;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Message {

	private String message;

	/*
	 * Here we Autowired MessageType so it will do same as writing
	 * 'autowire="byName"' in XML
	 * Now we have two bean defintion of type MessageType in our xml if we
	 * simple use @Autowire it wont know which one to inject. Hence we
	 * used @Qualifier and passed in the id of the bean we want to inject
	 * explicitly
	 */
	@Autowired
	@Qualifier("messageType1")
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
