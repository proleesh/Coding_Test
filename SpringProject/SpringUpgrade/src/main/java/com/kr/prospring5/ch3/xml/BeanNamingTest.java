package com.kr.prospring5.ch3.xml;

import java.util.Map;

import org.springframework.context.support.GenericXmlApplicationContext;


public class BeanNamingTest {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-01.xml");
		ctx.refresh();
		
		Map<java.lang.String, String> beans = ctx.getBeansOfType(String.class);
		
		beans.entrySet().stream().forEach(b -> System.out.println(b.getKey()));
		
		ctx.close();
	}

}
