package com.pankaj.deppendencyinv.begin;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Message {
	
	private String msg;
	
	private LocalDateTime timestamp;

	public Message(String msg) {
		super();
		this.msg = msg;
		this.timestamp = LocalDateTime.now(ZoneId.of("UTC"));
		
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	
	

}
