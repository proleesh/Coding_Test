package com.kr.prospring5.ch2.annotated;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kr.prospring5.ch2.decoupled.MessageRenderer;

public class HelloWorldSpringAnnotated {
	public static void main(String[] args) {
		//클래스에서 빈 구서응ㄹ 읽어 들일 수 있도록 우리는 AnnotationConfigApplicaitonContext(xxx.class)를 쓴다.
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		MessageRenderer mr = (MessageRenderer)ctx.getBean("renderer");
		mr.render();
		//결론 스프링 구성은 XML없이도 유연하게 할 수 있습니다.
	}

}
