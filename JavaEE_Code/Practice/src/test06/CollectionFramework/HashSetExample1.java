package test06.CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
	public static void main(String[] args) {
		
		//HashSet은 Set 인터페이스의 구현 클래스이다.
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");//Java는 한 번만 저장됨 (중복은 무시)
		set.add("iBATIS");
		
		//저장된 객체 수 얻기
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		//반복자 얻기
		Iterator<String> iterator = set.iterator();
		
		//객체 수만큼 루핑
		while(iterator.hasNext()) {
			//한 개의 객체를 가져온다
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		//객체 삭제
		set.remove("JDBC");
		set.remove("iBATIS");
		
		//저장된 객체 수 얻기
		System.out.println("총 객체수: " + set.size());
		
		//반복자 얻기
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		//모든 객체 제거
		set.clear();
		//비우면 isEmpty()메소드로 검정하면 된다
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}

}
