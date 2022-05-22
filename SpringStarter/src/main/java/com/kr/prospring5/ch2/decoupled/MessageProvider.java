package com.kr.prospring5.ch2.decoupled;

// Component
public interface MessageProvider {
	//Message제공자 인터페이스를 정의한다.
	String getMessage(); //클래스 Method 정의
//애플리케이션을 유연하게 만들려면 interface를 사용해 component(요소)와 launcher(발사 장치)를 연결해야 합니다.
	
}
