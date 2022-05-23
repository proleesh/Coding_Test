package com.kr.prospring5.ch3;

/**
 * 
 * @author sungh
 *
 */
public class SetterInjection {
	/**
	 *  수정자 의존성 주입(Setter Dependency Injection)
	 */
	private Dependency dependency;

	public void setDependency(Dependency dependency) {
		this.dependency = dependency;
	}

	@Override
	public String toString() {
		return "SetterInjection [dependency=" + dependency.toString() + "]";
	}
	
	

}
