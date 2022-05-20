package com.kr.shl.ioc.scope;

public class Student {
	
	private Integer id;
	
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() {
		System.out.println("Student 구조 메서드");
	}

//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + "]";
//	}

}
