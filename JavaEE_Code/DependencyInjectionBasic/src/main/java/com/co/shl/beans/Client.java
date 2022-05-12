package com.co.shl.beans;

public class Client {
	private String name;
	private int age;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Client(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Client [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

}
