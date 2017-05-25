package com.adarsh.www;

public class HellpSpring {

	private String message;
	private MessageType messageType;

	public HellpSpring(String message, MessageType messageType) {
		this.message = message;
		this.messageType = messageType;
	}

	public String getMessage() {
		return message;
	}

	public MessageType getMessageType() {
		return messageType;
	}

}
