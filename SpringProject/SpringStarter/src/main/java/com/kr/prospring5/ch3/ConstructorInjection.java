package com.kr.prospring5.ch3;

/**
 * 
 * @author sungh
 *
 */
public class ConstructorInjection {
	/**
	 * 생성자 의존성 주입 (Construction Dependency Injection)
	 */
	private Dependency dependency;
	
	public ConstructorInjection(Dependency dependency) {
		this.dependency = dependency;
	}

	@Override
	public String toString() {
		return "ConstructionInjection [dependency=" + dependency.toString() + "]";
	}

}
