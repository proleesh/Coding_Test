package test06.CollectionFramework;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
	public static void main(String[] args) {
		//고정된 List를 생성할 때 asList(T...a)메소드를 사용한다
		List<String> list1 = Arrays.asList("Jessie", "Jennie", "Rose");
		for(String name : list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for(int value : list2) {
			System.out.println(value);
		}
	}

}
