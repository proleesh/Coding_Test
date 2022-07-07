package com.example.naengmyeon.factory;

import java.security.MessageDigest;

import org.springframework.context.support.GenericXmlApplicationContext;

public class AccessingFactoryBeans {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-xml-7.xml");
		ctx.refresh();
		ctx.getBean("shaDigest", MessageDigest.class);
		
		MessageDigestFactoryBean factoryBean = (MessageDigestFactoryBean)ctx.getBean("&shaDigest");
		try {
			MessageDigest shaDigest = factoryBean.getObject();
			System.out.println(shaDigest.digest("Hello world".getBytes()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		ctx.close();
	}

}
