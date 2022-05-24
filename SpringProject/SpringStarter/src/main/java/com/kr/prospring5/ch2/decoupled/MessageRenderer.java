package com.kr.prospring5.ch2.decoupled;

// Renderer 인터페이스
// MessageProvider를 가져오는 책임을 한다.
// 따라서 MessageProvider이랑 MessageRendere는 의존성이 있다.
public interface MessageRenderer {
	void render(); // Method 1
	void setMessageProvider(MessageProvider messageProvider); // Method 2
	MessageProvider getMessageProvider(); 

}
