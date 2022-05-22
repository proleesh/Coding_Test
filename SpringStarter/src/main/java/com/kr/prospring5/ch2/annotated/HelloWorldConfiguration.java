package com.kr.prospring5.ch2.annotated;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kr.prospring5.ch2.decoupled.HelloWorldMessageProvider;
import com.kr.prospring5.ch2.decoupled.MessageProvider;
import com.kr.prospring5.ch2.decoupled.MessageRenderer;
import com.kr.prospring5.ch2.decoupled.StandardOutMessageRenderer;

@Configuration
public class HelloWorldConfiguration {
	
	/**
	 * Spring 3.0부터 스프링 기반 애플리케이션을 개발할 때 더 이상 XML 구성 파일을 사용하지 않아도 됩니다.
	 * 애너테이션(Annotation,@)과 구성 클래스를 사용하면 XML 구성 파일을 대체할 수 있습니다.
	 * 구성 클래스는 빈 정의 내용을 담고 있는 @Configuration 애너테이션이 붙은 클래스이거나 
	 * @CompenetScan 애너네이션이 붙여 애플리켄이션 내의 빈 정의를 스스로 찾는 클래스 입니다.
	 */
	
	//다음은 <bean id="provider" class=".."/> 구상과 동등함.
	@Bean
	public MessageProvider provider() {
		return new HelloWorldMessageProvider(); //return "Hello World"
	}
	//다음은 <bean id="renderer" class=".."/> 구성과 동등함
	@Bean
	public MessageRenderer renderer() {
		MessageRenderer renderer = new StandardOutMessageRenderer();
		renderer.setMessageProvider(provider());
		return renderer;
		
	}
}
