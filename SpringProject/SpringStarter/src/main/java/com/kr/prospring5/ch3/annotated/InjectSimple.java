package com.kr.prospring5.ch3.annotated;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;
/**
 * 애너테이션을 써도 똑같은 결과를 얻을 수 있다
 * @author sungh
 *
 */
@Service("injectSimple")
public class InjectSimple {
	/**
	 * 애너테이션을 사용해 단순 값을 주입하려면 ,@Value 애너테이션을 빈 프로퍼티에 적용합니다.
	 * 이번에는 수정자 메서드 대신 다음 코드처럼 프로퍼티 선언에 애너테이션을 적용합니다.
	 * 스프링에서는 수정자 메서드나 프로퍼티에 애너테이션을 사용할 수 있습니다.
	 */
	
	@Value("Sunghyuk")
	private String name;
	@Value("24")
	private int age;
	@Value("179")
	private float height;
	@Value("true")
	private boolean programmer;
	@Value("721139619")
	private Long ageInSeconds;
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context.xml");
		ctx.refresh();
		
		InjectSimple simple = (InjectSimple)ctx.getBean("injectSimple");
		System.out.println(simple);
		ctx.close();
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void setProgrammer(boolean programmer) {
		this.programmer = programmer;
	}

	public void setAgeInSeconds(Long ageInSeconds) {
		this.ageInSeconds = ageInSeconds;
	}

	@Override
	public String toString() {
		return "InjectSimple [name=" + name + ", age=" + age + ", height=" + height + ", programmer=" + programmer
				+ ", ageInSeconds=" + ageInSeconds + "]";
	}
	
}
