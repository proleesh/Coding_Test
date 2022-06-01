package com.kr.prospring5.ch3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.kr.prospring5.ch3.Oracle;

public class InjectRef {
	private Oracle oracle;

	public void setOracle(Oracle oracle) {
		this.oracle = oracle;
	}
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-xml.xml");
		ctx.refresh();
		
		InjectRef injectRef = (InjectRef)ctx.getBean("injectRef");
		System.out.println(injectRef);
		
		ctx.close();
	}
	@Override
	public String toString() {
		return "InjectRef [oracle=" + oracle.defineMeaningOfLife() + "]";
	}
	 

}
