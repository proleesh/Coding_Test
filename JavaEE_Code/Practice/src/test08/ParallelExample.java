package test08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"이성혁", "삼성", "자바", "람다식"
				);
		//순차 처리
		Stream<String> stream = list.stream();
		//             메소드 참조(s->ParallelExample.print(s)와 동일)
		stream.forEach(ParallelExample :: print);
		System.out.println();
		
		//병렬 처리
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelExample :: print);

	}
	public static void print(String str) {
		System.out.println(str+ " : " + Thread.currentThread().getName());
	}

}
