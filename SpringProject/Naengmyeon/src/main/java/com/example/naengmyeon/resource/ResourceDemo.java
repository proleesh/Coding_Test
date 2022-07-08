package com.example.naengmyeon.resource;

import java.io.File;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class ResourceDemo {
	public static void main(String[] args) throws Exception{
		ApplicationContext ctx = new ClassPathXmlApplicationContext();
		
		File file = File.createTempFile("test", "txt");
		file.deleteOnExit();
		
		//file:/// 슬래시가 3개인 이유는 마지막 슬래시가 생략한 컴퓨터이름의 역할을 한다.
		Resource res1 = ctx.getResource("file:///" + file.getPath());
		displayInfo(res1);
		Resource res2 = ctx.getResource("classpath:test/test.txt");
		displayInfo(res2);
		Resource res3 = ctx.getResource("https://www.google.com");
		displayInfo(res3);
		
	}

	private static void displayInfo(Resource res) throws Exception {
		System.out.println(res.getClass());
		System.out.println(res.getURL().getContent());
		System.out.println("");
		
	}

}
