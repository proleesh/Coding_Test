package com.kr.prospring5.ch3.xml;

import com.kr.prospring5.ch2.decoupled.MessageProvider;


public class ConfigurableMessageProvider implements MessageProvider{
	
	private String message;
	


	public ConfigurableMessageProvider(String message) {
		this.message = message;
	}


	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
	

}
