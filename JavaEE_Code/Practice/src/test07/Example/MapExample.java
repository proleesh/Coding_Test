package test07.Example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		//최고 점수를 받은 아이디 저장
		String name = null;
		//최고 점수 저장
		int maxScore = 0;
		//점수 합계 저장
		int totalScore = 0;
		
		//다가져오기
		Set<Map.Entry<String, Integer>> EntrySet = map.entrySet();
		//for문으로 조건걸어놓기
		for(Map.Entry<String, Integer> entry : EntrySet) {
			if(entry.getValue() > maxScore) {
				name = entry.getKey();
				maxScore = entry.getValue();
			}
			totalScore += entry.getValue();
		}
		int avgScore = totalScore / map.size();
		System.out.println("평균점수: " + avgScore);
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);
	}

}
