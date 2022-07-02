package test09;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동",
				"이순신", "하하", "감자바", "하하");
		
		names.stream()
		.distinct() //중복 제거
		.forEach(n -> System.out.println(n));
		System.out.println();
		
		names.stream()
		.filter(n -> n.startsWith("감")) //필터링
		.forEach(n -> System.out.println(n));
		System.out.println();
		
		names.stream()
		//중복 제거 후 필터링
		.distinct()
		.filter(n -> n.startsWith("홍"))
		.forEach(n -> System.out.println(n));
		
	}

}
