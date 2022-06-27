package test05.Example;

import java.util.function.ToIntFunction;

public class LamdaExample3 {
	private static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("이미연", 80, 33)
	};
	
	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for(Student student : students) {
			sum += function.applyAsInt(student);
		}
		double avg = (double)sum/students.length;
		return avg;
		
	}
	
	
	public static void main(String[] args) {
//		double englishAvg = avg(s->s.getEnglishScore());
		double englishAvg = avg(Student :: getEnglishScore);
		System.out.println("영어 평균 점수: " + englishAvg);
//		double mathAvg = avg(s->s.getMathScore());
		double mathAvg = avg(Student :: getMathScore);
		System.out.println("수학 평균 점수: " + mathAvg);
	}
	

}
