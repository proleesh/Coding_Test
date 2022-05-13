package com.co.shl.beans;

import java.util.List;
import java.util.Map;

public class Client {
	private String name;
	private int age;
	private String gender;
	private List<String> cls;
	private List<Employee> employees;
	private Map<String, String> bossMap;
public Map<String, String> getBossMap() {
		return bossMap;
	}
	public void setBossMap(Map<String, String> bossMap) {
		this.bossMap = bossMap;
	}
	//	public List<Client> getcList() {
//		return cList;
//	}
//	public void setcList(List<Client> cList) {
//		this.cList = cList;
//	}
// Getter Setter의 문법은 반드시 getUpper setUpper로 써야된다 getlOwer setlOwer로 쓰면 작용이 안 된다. 기억해 두자.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public List<String> getCls() {
		return cls;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public void setCls(List<String> cls) {
		this.cls = cls;
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
		return "Client [name=" + name + ", age=" + age + ", gender=" + gender + ", cls=" + cls + ", employees="
				+ employees + ", bossMap=" + bossMap + "]";
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

}
