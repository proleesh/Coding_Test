package com.co.shl.beans;

public class Employee{
	private String name;
	private int age;
	private String gender;
	private double score;
	private Client client;
	
	public Employee(String name, int age, String gender, double score) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
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
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", gender=" + gender + ", score=" + score + ", client="
				+ client + "]";
	}
	
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

}
