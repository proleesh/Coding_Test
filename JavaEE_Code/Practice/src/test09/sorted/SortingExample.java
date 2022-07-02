package test09.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {
	public static void main(String[] args) {
		//숫자 요소일 경우
		IntStream intStream = Arrays.stream(new int[] {5, 3, 1, 2, 4});
		intStream
		.sorted() // 숫자를 오름차순으로 정렬
		.forEach(n -> System.out.println(n + ","));
		System.out.println();
		
		//객체 요소일 경우
		List<Student> studentList = Arrays.asList(
				new Student("이순신", 30),
				new Student("홍길동", 20),
				new Student("장보고", 10)
				);
		studentList.stream()
		.sorted() //점수를 기준으로 오름차순으로 Student 정렬
		.forEach(s -> System.out.println(s.getScore()));
		System.out.println();
		
		studentList.stream()
		.sorted(Comparator.reverseOrder()) //점수를 기준으로 내림차순으로 Student 정렬
		.forEach(s -> System.out.println(s.getScore() + ","));
	}

}
