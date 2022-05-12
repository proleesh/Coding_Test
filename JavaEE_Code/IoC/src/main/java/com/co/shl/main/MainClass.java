package com.co.shl.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.co.shl.beans.TestBean;

public class MainClass {
	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
	}

//	BeanFactory 패키지 내부
	public static void test1() {
		ClassPathResource res = new ClassPathResource("com/co/shl/config/beans.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		TestBean t1 = (TestBean)factory.getBean("t1");//컨테이너에 보관하다가
		System.out.printf("T1: %s\n", t1);
		
		TestBean t2 = (TestBean)factory.getBean("t1"); //필요할 때 객체 주소값을 가져온다.
		System.out.printf("T2: %s\n", t2);//결론 똑 같이 가져온다
	}
//	BeanFactory 패키지 외부
	public static void test2() {
		FileSystemResource res = new FileSystemResource("beans.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		TestBean outside = (TestBean)factory.getBean("outside");
		System.out.printf("Bean Factory Outside: %s\n", outside);
	}
//	ApplicationContext - 패키지 내부
	public static void test3() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/co/shl/config/beans.xml");
		
		TestBean t3 = (TestBean)ctx.getBean("t3");
		System.out.printf("T3: %s\n", t3);
		
		ctx.close();//닫아준다.
	}
//	ApplicationContext - 패키지 외부
	public static void test4() {
		FileSystemXmlApplicationContext fsac = new FileSystemXmlApplicationContext("beans.xml");
		
		TestBean outside = (TestBean)fsac.getBean("outside");
		System.out.printf("ApplicationContext Outside: %s\n", outside);
	}
}
