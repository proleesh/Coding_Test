package com.kr.shl.ioc.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.kr.shl.ioc.life.Person;
import com.kr.shl.ioc.scope.Student;

public class Main {
	public static void main(String[] args) {
		/**
		 * 만약 Spring중에 싱글톤 패턴(singleton pattern)의 bean이 존재한다면.
		 * container가 초기화할 때 이 클래스를 생성한다.
		 * 여러 instance 즉 prototype bean이 사용될 때 생성됩니다.
		 */
		
		FileSystemXmlApplicationContext fsxac = new FileSystemXmlApplicationContext("beans.xml");
		
		/*
		 * Student st1 = (Student)fsxac.getBean("student1"); Student st2 =
		 * (Student)fsxac.getBean("student1"); System.out.println(st1);
		 * System.out.println(st2);
		 */
		Person ps1 = (Person)fsxac.getBean("person");
		System.out.println(ps1);
		fsxac.close();
	}

}
