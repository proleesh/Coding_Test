package test04.StandardAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
	private static List<Student> list = Arrays.asList(
			new Student("나은", 83, 99),
			new Student("조현", 93, 88)
			);
	public static void printString(Function<Student, String> function) {
		for(Student student : list) {
			System.out.println(function.apply(student) + " ");
		}
		System.out.println();
	}
	
	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for(Student student : list) {
			//람다식 실행
			sum += function.applyAsInt(student);
		}
		double avg = (double)sum / list.size();
		return avg;
	}
	public static void main(String[] args) {
		
		System.out.println("이름: ");
		printString(s -> s.getName());
		
		
		double englishAvg = avg( s -> s.getEnglishScore());
		System.out.println("영어 평균 점수: " + englishAvg);
		
		double mathAvg = avg( s -> s.getMathScore());
		System.out.println("수학 평균 점수: " + mathAvg);
	}

}
