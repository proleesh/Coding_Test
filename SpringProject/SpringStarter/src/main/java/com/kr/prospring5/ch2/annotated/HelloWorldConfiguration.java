package com.kr.prospring5.ch2.annotated;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.kr.prospring5.ch2.decoupled.HelloWorldMessageProvider;
import com.kr.prospring5.ch2.decoupled.MessageProvider;
import com.kr.prospring5.ch2.decoupled.MessageRenderer;
import com.kr.prospring5.ch2.decoupled.StandardOutMessageRenderer;

/**
 * Annotation을 쓰는 것을 추천한다. 물론 bean에서 쓰는 것도 나쁘지는 않지만.
 * 간결하게 쓰기 위해 또는 코드에서 한 번에 작성하기 위해 Annotation을 쓰는 것이 더 좋다.
 * @ImportResource를 사용해 하나 이상의 XML파일에서 빈 정의를 가져올수 있다.
 * @ComponentScan을 사용해 beans.xml에 있는 <context:component-scanning.../>을 대체 쓸수 있다. 기능은 똑 같다.
 * @author sungh
 *
 */
/*
 * @ImportResource(locations = {"classpath:spring/beans.xml"})
 * 
 * @ComponentScan(basePackages = {"com.kr.prospring5.ch3.annotated"})
 */
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
