package com.example.naengmyeon.events;

import org.springframework.context.ApplicationListener;

public class MessageEventListener implements ApplicationListener<MessageEvent>{

	@Override
	public void onApplicationEvent(MessageEvent event) {
		MessageEvent msgEvt = event;
		System.out.println("수신: " + msgEvt.getMessage());
		
	}
	

}
