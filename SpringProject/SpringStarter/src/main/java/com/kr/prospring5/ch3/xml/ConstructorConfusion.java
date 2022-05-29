package com.kr.prospring5.ch3.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ConstructorConfusion {
	private String someValue;

	public ConstructorConfusion(String someValue) {
		System.out.println("ConstructorConfusion(String) 호출");
		this.someValue = someValue;
	}
	/**
	 * 원하는 생성자 메서드에 @Autowired 애너테이션을 적용하면 스프링은 이 메서드를 사용해 빈 인스턴스를
	 * 생성하고 지정한 값을 주입합니다. 
	 * 값은 외부 구성에서 가져오는 것이 바람직하다.
	 * @param someValue
	 */
	@Autowired
	public ConstructorConfusion(@Value("90")int someValue) {
		System.out.println("ConstructorConfusion(int) 호출");
		this.someValue = Integer.toString(someValue);
	}

	@Override
	public String toString() {
		return "ConstructorConfusion [someValue=" + someValue + "]";
	}
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-xml.xml");
		ctx.refresh();
		ConstructorConfusion cc = (ConstructorConfusion)ctx.getBean("constructorConfusion");
		System.out.println(cc);
		ctx.close();
	}
	
	
	
}
