package com.kr.shl.ioc.life;

public class Person {
	private Integer id;
	private String sex;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		System.out.println("Two: Dependency Injection");
		this.id = id;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person() {
		System.out.println("One: 클래스 생성");
		
		// TODO Auto-generated constructor stub
	}
	
	public void init() {
		System.out.println("Three: 초기화");
	}
	
	public void destroy() {
		System.out.println("Five: 파괴");
	}
	@Override
	public String toString() {
		return "Four: 사용";
	}

}
