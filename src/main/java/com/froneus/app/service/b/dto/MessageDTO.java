package com.froneus.app.service.b.dto;

public class MessageDTO {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MessageDTO [message=" + message + "]";
	}
	
}
