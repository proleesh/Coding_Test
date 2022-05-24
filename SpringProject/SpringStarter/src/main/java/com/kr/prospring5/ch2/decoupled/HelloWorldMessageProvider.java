package com.kr.prospring5.ch2.decoupled;

import org.springframework.stereotype.Component;

/**
 * Provider 구현체
 * @author sungh
 *
 */
//간단한 빈
@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider{

	@Override
	public String getMessage() {
		
		return "Hello World";// Hello World를 반환한다.
	}
	

}
