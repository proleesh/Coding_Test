package com.example.naengmyeon.provider;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.naengmyeon.hello.MessageRenderer;

public class JavaConfigExampleTwo {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigTwo.class);
		MessageRenderer renderer = ctx.getBean("messageRenderer", MessageRenderer.class);
		
		renderer.render();
	}

}
