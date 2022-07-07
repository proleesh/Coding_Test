package com.example.naengmyeon.aware;

import org.springframework.context.support.GenericXmlApplicationContext;

public class NamedSingerDemo {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-xml-5.xml");
		ctx.refresh();
		
		NamedSinger bean = (NamedSinger)ctx.getBean("johnMayer");
		bean.sing();
		
		ctx.close();
	}

}
