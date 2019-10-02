package com.isoftware.primerica.paisleyfinancialservices.entity;

public class Email {
	
	private String name;
	private String subject;
	private String message;
	
	
	public Email() {
		
	};
	
	public Email(String name, String subject, String message) {
		this.name = name;
		this.subject = subject;
		this.message = message;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public String getMessage() {
		return message;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
