package com.kr.prospring5.ch3;

public interface Container {
	//다음 예제 코드는 의존성 룩업 서비스를 제공하는 간단한 컨테이너 인터페이스입니다.
	Object getDependency(String key);

}
