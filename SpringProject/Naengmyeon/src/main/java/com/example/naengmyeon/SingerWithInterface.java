package com.example.naengmyeon;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SingerWithInterface implements InitializingBean {
	private static final String DEFAULT_NAME = "Eric Clapton";
	
	private String name;
	private int age = Integer.MIN_VALUE;
	
	
	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("빈 초기화");
		
		if(name == null) {
			System.out.println("기본 가수 이름 설정");
			name = DEFAULT_NAME;
		}
		
		if(age == Integer.MIN_VALUE) {
			throw new IllegalArgumentException(
					SingerWithInterface.class + "빈 타입에는 반드시 age 프로퍼티를 설정해야 합니다."
					);
		}

	}


	@Override
	public String toString() {
		return "SingerWithInterface [name=" + name + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-xml-2.xml");
		ctx.refresh();
		
		getBean("singerOne", ctx);
		getBean("singerTwo", ctx);
		getBean("singerThree", ctx);
		
		ctx.close();
	}


	private static SingerWithInterface getBean(String beanName, ApplicationContext ctx) {
		try {
			SingerWithInterface bean = (SingerWithInterface)ctx.getBean(beanName);
			System.out.println(bean);
			return bean;
		} catch (BeanCreationException ex) {
			System.out.println("빈 구성 도중 에러 발생: " + ex.getMessage());
			return null;
		}
		
		
	}

}
