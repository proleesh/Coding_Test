package com.example.naengmyeon.message;

import java.util.Locale;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MessageSourceDemo {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-xml-11.xml");
		ctx.refresh();
		
		Locale english = Locale.ENGLISH;
		Locale korean = new Locale("ko", "KR");
		Locale chinese = new Locale("ch", "CN");
		
		System.out.println(ctx.getMessage("msg", null, english));
		System.out.println(ctx.getMessage("msg", null, korean));
		System.out.println(ctx.getMessage("msg", null, chinese));
		
		System.out.println(ctx.getMessage("nameMsg", 
				new Object[] {"John", "Mayer"}, english));
		System.out.println(ctx.getMessage("nameMsg",
				new Object[] {"John", "Mayer"}, korean));
		System.out.println(ctx.getMessage("nameMsg",
				new Object[] {"John", "Mayer"}, chinese));
		
		
		ctx.close();
	}

}
