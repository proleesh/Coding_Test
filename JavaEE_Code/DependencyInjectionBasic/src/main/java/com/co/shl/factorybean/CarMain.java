package com.co.shl.factorybean;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CarMain {
	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext FileSysac = new FileSystemXmlApplicationContext("factory-bean.xml");
		
		Object object = FileSysac.getBean("factory");
		System.out.println(object);
		
	}

}
