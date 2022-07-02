package test09;

import java.util.Arrays;
import java.util.stream.IntStream;
/*
 * asDoubleStream() 메소드는 IntStream의 int 요소 또는 LongStream의 long 요소를 double 요소로
 * 타입 변환해서  DoubleStream을 생성한다. 마찬가지로 asLongStream() 메소드는 IntStream의 int요소를
 * 타입 변환해서 LongStream을 생성한다. boxed() 메소드는 int, long, double 요소를 Integer, Long
 * Double 요소로 박싱해서 Stream을 생성한다.
 */
public class AsDoubleStreamAndBoxedExample {
	public static void main(String[] args) {
		int[] intArrays = {1, 2, 3, 4, 5};
		
		IntStream intStream = Arrays.stream(intArrays);
		intStream
		.asDoubleStream() //DoubleStream 생성
		.forEach(d -> System.out.println(d));
		
		System.out.println();
		
		intStream = Arrays.stream(intArrays);
		intStream
		.boxed() //Stream<Integer> 생성
		.forEach(obj -> System.out.println(obj.intValue()));
	}

}
