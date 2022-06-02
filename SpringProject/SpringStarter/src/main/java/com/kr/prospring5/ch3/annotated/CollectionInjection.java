package com.kr.prospring5.ch3.annotated;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("injectCollection")
public class CollectionInjection {
	/**
	 * @Autowired 대신 @Resource Annotation을 사용한 이유는 빈 이름을 지정함으로써
	 * 스프링에 명시적으로 의존성을 알맞게 주입하도록 알려저야 합니다.
	 * @Autowired Annotation이 배열, 컬렉션, 맵을 해당 컬렉션의 값 타입에서 파생된 대상 빈 타입을
	 * 가져와 처리하기 때문입니다. 예를 들어 클래스에 List <ContentHolder> 타입의 attribute가 있고
	 * @Autowired Annotation이 적용돼 있었다면 스프링은 구성 파일에 선언된 <util:list> 대신 현재
	 * ApplicationContext내의 ContentHolder 타입의 모든 빈을 해당 Attribute에 주입하려고 시도하며,
	 * 그 결과 의도하지 않은 의존성이 주입되거나 ContextHolder 타입 빈이 정의 되지 않아 스프링이 예외를 던질 수 있다.
	 * 
	 * 따라서 결론 @Autowired(자동배선된)와 @Qualifier(권한부여) Annotation을 조합해 사용해도
	 * 동일한 목적을 달성할 수 있지만, 하나의 Annotation을 사용하는 것이 바람직합니다.
	 * 
	 */	
	/* @Resource(name="map") */
	@Autowired
	@Qualifier("map")
	private Map<String, Object> map;
	@Resource(name="props")
	private Properties props;
	@Resource(name="set")
	private Set set;
	@Resource(name="list")
	private List list;
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-annotation.xml");
		ctx.refresh();
		
		CollectionInjection ci = (CollectionInjection)ctx.getBean("injectCollection");
		ci.displayInfo();
		
		ctx.close();
	}

	private void displayInfo() {
		System.out.println("Map 내용: \n");
		map.entrySet().stream().forEach(e -> System.out.println("키: " + e.getKey() + " - 값: " + e.getValue()));

		System.out.println("\nProperty 내용: \n");
		props.entrySet().stream().forEach(e -> System.out.println("키: " + e.getKey() + " - 값: " + e.getValue()));

		System.out.println("\nSet 내용: \n");
		set.forEach(obj -> System.out.println("값: " + obj));

		System.out.println("\nList 내용: \n");
		list.forEach(obj -> System.out.println("값: " + obj));
		
	}

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


}
