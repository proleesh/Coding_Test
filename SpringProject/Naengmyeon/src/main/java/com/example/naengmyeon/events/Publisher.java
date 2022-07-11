package com.example.naengmyeon.events;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Publisher implements ApplicationContextAware{
	private ApplicationContext ctx;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.ctx = applicationContext;
	}
	
	public void publish(String message) {
		ctx.publishEvent(new MessageEvent(this, message));
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"classpath:spring/app-context-xml-12.xml");
		Publisher pub = (Publisher) ctx.getBean("publisher");
		pub.publish("나는 세상에 SOS를 보낸다...");
		pub.publish("... 나는 누군가가 병에 담긴...");
		pub.publish("... 이 메시지를 받았으면 한다.");
		
	}
	

}
