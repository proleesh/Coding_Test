package com.example.naengmyeon.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.naengmyeon.hello.MessageProvider;

@Service("provider")
public class ConfigurableMessageProvider implements MessageProvider {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public ConfigurableMessageProvider(@Value("Love on the weekend")String message) {
		super();
		this.message = message;
	}
	
	

}
