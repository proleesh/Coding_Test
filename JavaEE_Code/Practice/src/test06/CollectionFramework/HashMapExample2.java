package test06.CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		//학번과 이름이 동일한 Student를 키로 저장
		map.put(new Student(1, "이성혁"), 100);
		map.put(new Student(1, "이성혁"), 100);
		
		//저장된 총 Map.Entry 수 얻기
		System.out.println("총 Entry 수: " + map.size());
		
	}

}
