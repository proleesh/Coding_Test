package com.kr.prospring5.ch2.decoupled;

public class StandardOutMessageRenderer implements MessageRenderer{

	private MessageProvider messageProvider;
	@Override
	public void render() {
		if(messageProvider == null) { // null이면 실행
			// 런타임예외처리
			throw new RuntimeException(
			"You must set the property messageProvider of class(당신은 반드시 클래스 messageProvider의 속성을 설정해야 합니다.:"
			+ StandardOutMessageRenderer.class.getName());
		}
		System.out.println(messageProvider.getMessage());
		
	}

	@Override
	public void setMessageProvider(MessageProvider messageProvider) {
		
		this.messageProvider = messageProvider;
		
	}

	@Override
	public MessageProvider getMessageProvider() {

		return this.messageProvider;
	}
	

}
