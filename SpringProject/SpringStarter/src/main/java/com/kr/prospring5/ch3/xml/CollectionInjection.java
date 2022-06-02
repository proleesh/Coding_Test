package com.kr.prospring5.ch3.xml;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * 빈이 개별 빈이나 값이 아닌 객체의 컬렉션에 접근해야 한는 일이 종종 있습니다. 따라서 스프링이 사용자 빈에 객체의 컬렉션을 주입할 수
 * 있다는 것은 놀랍지 않습니다. 컬렉션을 사용하는 방법은 간단합니다. List, Map, Set, Properties 인스턴스를
 * 나타내는<list>,<map>,<set>,<props>태그 중 하나를 선택하고 다른 주입 방식처럼 개별 항목을 전달합니다.
 * 
 * Properties클래스는 String 프로퍼티 값만을 허용하기 때문에 <props>태그는 String만 값으로 전달이 가능.
 * <list>,<map>,<set>을 사용해 프로퍼티에 주입할 때 원하는 태그를 사용이 가능. 다른 컬렉션 태그도 사용이 가능. list에
 * 여러map을 담거나, map에 여러 set을 담을 수도 있으며, 심지어 list 내부에 set을 담고 다시 map을 담은 후 list를
 * 담더라도 전달할 수 있습니다.
 * 
 * @author sungh
 *
 */
public class CollectionInjection {
	private Map<String, Object> map;
	private Properties props;
	private Set set;
	private List list;

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-xml.xml");
		ctx.refresh();

		CollectionInjection instance = (CollectionInjection) ctx.getBean("injectCollection");
		instance.displayInfo();

		ctx.close();
	}

	private void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("Map 내용: \n");
		map.entrySet().stream().forEach(e -> System.out.println("키: " + e.getKey() + " - 값: " + e.getValue()));

		System.out.println("\nProperty 내용: \n");
		props.entrySet().stream().forEach(e -> System.out.println("키: " + e.getKey() + " - 값: " + e.getValue()));

		System.out.println("\nSet 내용: \n");
		set.forEach(obj -> System.out.println("값: " + obj));

		System.out.println("\nList 내용: \n");
		list.forEach(obj -> System.out.println("값: " + obj));

	}

//	Map<String, Object>는 JDK 5이상 버전 이라면 스프링 강타입(强타입) Collection 선언을 지원
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public void setSet(Set set) {
		this.set = set;
	}

	public void setList(List list) {
		this.list = list;
	}
	/**
	 * 컬렉션 기능을 사용하면 애플리케이션을 모듈화하기가 쉽고 서로 다른 애플리케이션 로직의 주요 부분을 사용자가 선택한
	 * 구현체로 제공할 수 있습니다. 기업 직원이 맞춤형 사무용품을 온라인으로 작성하고, 교정하고, 주문을 하는 시스템을 생각
	 * 해 보겠습니다. 이 시스템은 각각 주문된 아트워크(예술품)를 제작할 준비가 완료되면 적절한 프린터로 전송합니다.
	 * 
	 * 여기서 복잡한 부분은 일부 프린터는 이메일, 일부는 FTP, 일부는 SCP(Secure Copy Protocol)를 사용한다는 점입니다.
	 * 
	 */
}
