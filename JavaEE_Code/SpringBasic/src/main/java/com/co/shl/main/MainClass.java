package com.co.shl.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.co.shl.beans.HelloWorld;

public class MainClass {
	public static void main(String[] args) {
		// beans.xml 파일를 로딩
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/co/shl/config/beans.xml");

		// xml에 정의한 bean객체의 주소값을 가져온다.
//		bean객체의 주소값을 가져오는 첫 번째 방법:
		HelloWorld helloEn = (HelloWorld)ctx.getBean("hello");
		callMethod(helloEn);//Hello!
//		bean객체의 주소값을 가져오는 두 번째 방법:
		HelloWorld helloEn2 = ctx.getBean("hello", HelloWorld.class);
		callMethod(helloEn2);//Hello!
//		이상 두가지 방법은 모두 가능함. 자기한테 맞는 스타일를 가지도록 하세요!
		
		HelloWorld helloKo = (HelloWorld)ctx.getBean("안녕");
		callMethod(helloKo);//안녕!!
		
		ctx.close();
	}

	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}
}
