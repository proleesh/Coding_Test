package com.kr.prospring5.ch3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kr.prospring5.ch2.decoupled.MessageRenderer;

public class DependencyPull {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/beans.xml");
		MessageRenderer mr = (MessageRenderer)ac.getBean("renderer");
		mr.render();//Hello World
		/**
		 * 이런 종류의 IoC는 의존성을 레지스트리에서 얻으려고 광범위하게 
		 * JNDI(Java Naming and Directory Interface)Look Up을 사용하는
		 * JEE(Java Enterprise Edition) 기반 애플리케이션
		 * (Enterprise JavaBean(EJB) 2.1 이하 버전 사용)에서만
		 * 자주 사용하는 것이 아니라, 다양한 환경에서 스프링을 사용할 때도 꼭 필용합니다.
		 */
	}

}
