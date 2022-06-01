package com.kr.prospring5.ch3.annotated;

import org.springframework.stereotype.Component;

/**
 * SpEL을 사용해 값 주입하기
 * SpEL(Spring Expression Language 스프링 표현식 언어)
 * SpEL을 사용하면 표현식을 동적으로 평가(evaluate)하여 그 결과를 스프링의 ApplicationContext내에서
 * 사용할 수 있습니다. 표현식 평가 결과는 스프링 빈에 주입될 수 있습니다.
 * @author sungh
 *
 */
//@Component를 사용하면 기본적으로 @Service와 동일한 효과를 얻을 수 있습니다.
/**
 * 둘 중 어떤 애너테이션이라도 적용한 클래스는, 애너테이션 기반 구성의 자동 검출과 클래스 경로 스캐닝의 대상이 됩니다.
 * 하지만 InjectSimpleConfig 클래스는 비즈니스 서비스를 제공하는 대신 애플리케이션의 구성을 가지고 있으므로
 * @Component를 사용하는 것이 더 적합합니다.
 * @Service는 @Component의 특수한 형태이며, @Service 애너테이션이 사용된 클래스는 애플리케이션 내의 다른 레이어에게
 * 비즈니스 서비스를 제공하고 있음을 나타냅니다.
 * @author sungh
 *
 */
@Component("injectSimpleConfig")
public class InjectSimpleConfig {
	private String name = "Sunghyuk";
	private int age = 24;
	private float height = 179.5f;
	private boolean programmer = true ;
	private Long ageInSeconds = 721139619L;
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public float getHeight() {
		return height;
	}
	public boolean isProgrammer() {
		return programmer;
	}
	public Long getAgeInSeconds() {
		return ageInSeconds;
	}
	

	
	

}
