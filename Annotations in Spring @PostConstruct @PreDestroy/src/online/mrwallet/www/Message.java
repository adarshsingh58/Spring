package online.mrwallet.www;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

public class Message {

	private String message;

	/*
	 * Here we Autowired MessageType so it will do same as writing
	 * 'autowire="byName"' in XML
	 */
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

	/**
	 * With the help of @PostCostruct we need not give init-method in the XMl
	 */
	@PostConstruct
	public void init() {
		System.out.println("Post COnstruct");
	}

	/**
	 * With the help of @PreDestroy we need not give destroy-method in the XMl
	 */
	@PreDestroy
	public void destroy()
	{
		System.out.println("Pre Destroy");
	}
}
