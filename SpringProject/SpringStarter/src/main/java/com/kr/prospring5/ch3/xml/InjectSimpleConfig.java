package com.kr.prospring5.ch3.xml;

/**
 * SpEL을 사용해 값 주입하기 SpEL(Spring Expression Language 스프링 표현식 언어) SpEL을 사용하면 표현식을
 * 동적으로 평가(evaluate)하여 그 결과를 스프링의 ApplicationContext내에서 사용할 수 있습니다. 표현식 평가 결과는
 * 스프링 빈에 주입될 수 있습니다.
 * 
 * @author sungh
 *
 */

public class InjectSimpleConfig {
	private String name = "Sunghyuk";
	private int age = 24;
	private float height = 179.5f;
	private boolean programmer = true;
//	private Long ageInSeconds = 7_359_169_333L;
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

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void setProgrammer(boolean programmer) {
		this.programmer = programmer;
	}

	public void setAgeInSeconds(Long ageInSeconds) {
		this.ageInSeconds = ageInSeconds;
	}

	public Long getAgeInSeconds() {
		return ageInSeconds;
	}

}
