package com.kr.prospring5.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;


public class HierarchicalAppContextUsage {
/**
 * 스프링은 ApplicationContext 인스턴스를 중첩시킬 때, 부모 컨텍스트에 있는 참조 빈을 자식 컨텍스트에 있는
 * 빈처럼 사용할 수 있게 해줍니다.  GenericXml~~를 사용하는 AppliationContext 중첩은 쉽게 이해할 수 있습니다.
 * 특정 GenericXmlApplicationContext를 다른 GenericXmlApplicationContext 클래스 안에 중첩 시키려면
 * 자식 ApplicationContext에서 간단히 setParent() 메서드를 호출하면 됩니다.
 * @param args
 */
	public static void main(String[] args) {
		GenericXmlApplicationContext parent = new GenericXmlApplicationContext();
		parent.load("classpath:spring/parent-context.xml");
		parent.refresh();
		
		GenericXmlApplicationContext child = new GenericXmlApplicationContext();
		child.load("classpath:spring/child-context.xml");
		child.setParent(parent);
		child.refresh();
		
		Song song1 = (Song)child.getBean("song1");
		Song song2 = (Song)child.getBean("song2");
		Song song3 = (Song)child.getBean("song3");
		
		System.out.println("parent 컨텍스트로부터: " + song1.getTitle());
		System.out.println("child 컨텍스트로부터: " + song2.getTitle());
		System.out.println("parent 컨텍스트로부터: " + song3.getTitle());
		
		child.close();
		parent.close();
	}

}
