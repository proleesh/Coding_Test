package com.example.naengmyeon.factory;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MessageDigestDemo {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-xml-6.xml");
		ctx.refresh();
		
		MessageDigester digester = ctx.getBean("digester", MessageDigester.class);
		digester.digest("Hello World!");
		
		ctx.close();
	}

}
