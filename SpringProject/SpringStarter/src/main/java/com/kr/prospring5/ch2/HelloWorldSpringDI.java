package com.kr.prospring5.ch2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.kr.prospring5.ch2.decoupled.MessageRenderer;

public class HelloWorldSpringDI {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/beans.xml");
//		FileSystemXmlApplicationContext ac = new FileSystemXmlApplicationContext("bean.xml");
		MessageRenderer mr = (MessageRenderer)ac.getBean("renderer");
		mr.render();//Hello World
	}

}
