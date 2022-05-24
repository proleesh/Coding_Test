package com.kr.prospring5.ch2.decoupled;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Renderer 구현체
 * @author sungh
 *
 */
//복잡한 서비스 빈
@Service("renderer")
public class StandardOutMessageRenderer implements MessageRenderer{

	private MessageProvider messageProvider;
	/**
	 * XML 구성 파일에서 <context:component-scan> 태그를 선언했으므로 스프링은 Application Context를
	 * 초기화하는 동안에 @Autowired 애너테이션을 발견하고 필요에 따라 의존성을 주입합니다.
	 * 그리고 @Autowired 대신 @Resource(name="messageProvider")를 써도 마찬가지이다. 같은 결과를 얻을 수 있다.
	 * @Resource 는 Java SE나 Java EE에서 모두 사용할 수 있는 애너테이션 입니다.
	 */
	@Override
	public void render() {
		if(messageProvider == null) { // null이면 실행
			// 런타임예외처리
			throw new RuntimeException(
			"You must set the property messageProvider of class(당신은 반드시 클래스 messageProvider의 Property를 설정해야 합니다.:"
			+ StandardOutMessageRenderer.class.getName());
		}
		System.out.println(messageProvider.getMessage());
		
	}

	//SET GET
	@Override
	@Autowired
	public void setMessageProvider(MessageProvider messageProvider) {
		
		this.messageProvider = messageProvider;
		
	}

	@Override
	public MessageProvider getMessageProvider() {

		return this.messageProvider;
	}
	

}
