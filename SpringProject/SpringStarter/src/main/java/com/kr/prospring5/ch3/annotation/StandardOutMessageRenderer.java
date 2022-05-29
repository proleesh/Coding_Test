package com.kr.prospring5.ch3.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kr.prospring5.ch2.decoupled.MessageProvider;
import com.kr.prospring5.ch2.decoupled.MessageRenderer;

@Service("rendere")
public class StandardOutMessageRenderer implements MessageRenderer{

	private MessageProvider messageProvider;

	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Autowired
	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;
		
	}

	@Override
	public MessageProvider getMessageProvider() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
