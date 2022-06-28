package test06.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		//자바4버전 이전에는 이렇게 쓴다 (타입 파라미터가 없다)
		//List list = new ArrayList();
		//Object obj = list.get(0); <-- 컬렉션에서 객체 검색
		//타입 변환 후 객체를 얻을수 있음 (다음은 String 타입의 경우)
		//String varName = (String) obj;
		
		//자바5이후 이렇게 쓴다 (타입 파라미터 지정)
		List<String> list = new ArrayList<String>();
		
		//String 객체를 저장
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		//저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체수: " + size);
		System.out.println();
		
		//2번 인덱스의 객체 얻기
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();
		
		//저장된 총 객체 수만큼 루핑
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		//2번 인덱스 객체 삭제(Database 삭제됨)
		list.remove(2);
		String getObj = list.get(2);
		System.out.println("2: " + getObj); //Servlet/JSP
		
		//2번 인덱스 객체 삭제(Servlet/JSP 삭제됨)
		list.remove(2);
		String getObj2 = list.get(2);
		System.out.println("2: " + getObj2); //iBATIS
		
		list.remove("iBATIS");
//		String getObj3 = list.get(2);
//		System.out.println("2: " + getObj3); //예외가 난다 2번 인덱스가 없기 때문에
		System.out.println();
		
		for(int i=0; i<list.size(); i++) {
			String s = list.get(i);
			System.out.println(i + ":" + s); //0:Java, 1:JDBC
		}
	}

}
