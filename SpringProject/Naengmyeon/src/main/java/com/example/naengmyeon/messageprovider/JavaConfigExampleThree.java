package com.example.naengmyeon.messageprovider;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.naengmyeon.hello.MessageRenderer;

public class JavaConfigExampleThree {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/app-context-xml-15.xml");
		MessageRenderer renderer = (MessageRenderer)ctx.getBean("messageRenderer");
		renderer.render();
	}

}
