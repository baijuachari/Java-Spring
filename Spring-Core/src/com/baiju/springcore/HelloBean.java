package com.baiju.springcore;

public class HelloBean {

	private String message;

	public HelloBean() {
		System.out.println("default constructor.");
    }
    
	public void setMessage(String message) {
    	this.message = message;
    }
    
    public String getMessage() {
    	return message;
    }
}