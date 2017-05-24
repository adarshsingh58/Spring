package online.mrwallet.www;

public class Message {

	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

	/**
	 * Pre initialization Method created here which will be called from applicationCintext.xml init parameter
	 * @throws Exception
	 */
	public void XYZ() throws Exception {
		System.out.println("Bean Post initializaton Started");
		
	}
	
	public void ABC()
	{
		System.out.println("Bean Pre Destruction Method call");
	}
}
