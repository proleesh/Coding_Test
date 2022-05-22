package com.kr.prospring5.ch2.decoupled;

public class HelloWorldMessageProvider implements MessageProvider{

	@Override
	public String getMessage() {
		
		return "Hello World";// Hello World를 반환한다.
	}
	

}
