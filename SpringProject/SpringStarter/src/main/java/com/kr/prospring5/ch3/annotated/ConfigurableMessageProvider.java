package com.kr.prospring5.ch3.annotated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.kr.prospring5.ch2.decoupled.MessageProvider;

@Service("provider")
public class ConfigurableMessageProvider implements MessageProvider {

	private String message;

	@Autowired
	public ConfigurableMessageProvider(@Value("Configurable message") String message) {

		this.message = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}
