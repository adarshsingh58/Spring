package online.mrwallet.www;

public class Message {

	private String message;
	private MessageType messageType;
	
	/** Constructor used for injecting MessageType object via Spring
	 * @param messageType
	 */
	public Message(String message,MessageType messageType) {
		this.message=message;
		this.messageType=messageType;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public MessageType getMessageType() {
		return messageType;
	}
	

}
