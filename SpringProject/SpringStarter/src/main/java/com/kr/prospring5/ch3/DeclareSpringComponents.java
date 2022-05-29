package com.kr.prospring5.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.kr.prospring5.ch2.decoupled.MessageProvider;

public class DeclareSpringComponents {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/beans.xml");
		ctx.refresh();
//		MessageRenderer messageRenderer = (MessageRenderer)ctx.getBean("renderer");
//		messageRenderer.render();
//		ctx.close();
		MessageProvider messageProvider = (MessageProvider)ctx.getBean("provider");
		System.out.println(messageProvider.getMessage());
	}

}
