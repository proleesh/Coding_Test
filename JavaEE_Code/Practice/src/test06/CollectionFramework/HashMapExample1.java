package test06.CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장
		map.put("이성혁", 24);
		map.put("이진솔", 26);
		map.put("이순신", 34);
		map.put("이성혁", 24);//같은 키가 있기 때문에 제일 마지막에 저장한 값으로 대치
		//저장된 총 Entry 수 얻기
		System.out.println("총 Entry 수: " +  map.size());
		
		//객체 찾기
		System.out.println("\t이순신 : " + map.get("이순신"));//이름(키)으로 점수(값)를 검색
		System.out.println();
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet(); //Key Set 얻기
		//반복해서 키를 얻고 값을 Map에서 얻어냄
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		//객체 삭제
		map.remove("이순신"); //키로 Map.Entry를 제거
		System.out.println("총 Entry 수: " + map.size());
		
		//객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); //Map.Entry Set얻기
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		//객체 전체 삭제
		map.clear(); //모든 MapEntry 삭제
		System.out.println("총 Entry 수: " + map.size());
	}

}
