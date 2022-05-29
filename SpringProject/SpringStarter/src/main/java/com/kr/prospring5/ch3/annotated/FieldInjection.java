package com.kr.prospring5.ch3.annotated;

import org.springframework.context.support.GenericXmlApplicationContext;

public class FieldInjection {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context.xml");
		ctx.refresh();
		
		Singer singerBean = ctx.getBean(Singer.class);
		singerBean.sing();
		
		ctx.close();//... For all my running, I can understand
	}

}
