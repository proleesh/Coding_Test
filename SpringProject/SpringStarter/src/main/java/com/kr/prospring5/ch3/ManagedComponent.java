package com.kr.prospring5.ch3;


public interface ManagedComponent {
	/**
	 * 다음은 문맥에 따른 의존성 룩업(CDL)은 컴포넌트가 다음 코드 조각과 비슷한 인터페이스를 구현하는 방식이다.
	 * @param container
	 */
	void performLookup(Container container);

}