package com.example.naengmyeon;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Singer {
	private static final String DEFAULT_NAME = "Eric Clapton"; //기본값
	
	private String name;
	private int age = Integer.MIN_VALUE;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	private void init() {
		System.out.println("빈 초기화");
		
		if(name == null) {
			System.out.println("기본 이름 사용");
			name = DEFAULT_NAME;
		}
		
		if(age == Integer.MIN_VALUE) {
			throw new IllegalArgumentException(
					Singer.class+"빈 타입에는 반드시 age 프로퍼티를 설정해야 합니다."
					);
		}
	}
	@Override
	public String toString() {
		return "Singer [name=" + name + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-xml.xml");
		ctx.refresh();
		
		getBean("singerOne", ctx);
		getBean("singerTwo", ctx);
		getBean("singerThree", ctx);
		
		ctx.close();
		
	}
	public static Singer getBean(String beanName, ApplicationContext ctx) {
		try {
			Singer bean = (Singer) ctx.getBean(beanName);
			System.out.println(bean);
			return bean;
		} catch (BeanCreationException ex) {
			System.out.println("빈 구성 도중 에러 발생: " + ex.getMessage());
			return null;
		}
		
	}
	

}
