package com.adarsh.www;

public class HellpSpring {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init()
	{
		System.out.println("Initialization Bean");
	}
	
	public void destroy()
	{
		System.out.println("Destroying Bean");
	}
	
}
