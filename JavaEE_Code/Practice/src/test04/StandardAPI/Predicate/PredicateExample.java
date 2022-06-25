package test04.StandardAPI.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class PredicateExample {
	private static List<Student> list = Arrays.asList(
			new Student("사쿠라", "여자", 94),
			new Student("야구라", "여자", 83),
			new Student("메구리", "여자", 99),
			new Student("나코", "여자", 87),
			new Student("켄", "남자", 99),
			new Student("준", "남자", 89)
	);
	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum =0;
		for(Student student : list) {
			if(predicate.test(student)) {
				count ++;
				sum += student.getScore();
			}
		}
		return (double) sum / count;
	}
	
	public static void main(String[] args) {
		//Predicate<Student> 인스턴스 타입
		double maleAvg = avg( t-> t.getSex().equals("남자"));
		System.out.println("남자 평균 점수: " + maleAvg);
		
		//Predicate<Student> 인스턴스 타입
		double femaleAvg = avg( t-> t.getSex().equals("여자"));
		System.out.println("여자 평균 점수: " + femaleAvg);
	}

}
