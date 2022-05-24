package com.kr.prospring5.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.kr.prospring5.ch2.decoupled.MessageRenderer;

public class DeclareSpringComponents {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/beans.xml");
		ctx.refresh();
		MessageRenderer messageRenderer = (MessageRenderer)ctx.getBean("renderer");
		messageRenderer.render();
		ctx.close();
	}

}
