package com.example.naengmyeon.provider;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.naengmyeon.hello.MessageRenderer;

public class JavaConfigExampleOne {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		MessageRenderer renderer = ctx.getBean("messageRenderer", MessageRenderer.class);
		renderer.render();
	}

}
