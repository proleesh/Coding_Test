package test11;

import java.util.Arrays;
import java.util.List;



public class MaleStudentExample {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("이순신", 10, Student.Sex.MALE),
				new Student("이재용", 10, Student.Sex.MALE),
				new Student("이주빈", 8, Student.Sex.FEMALE)
				);
		//parallelStream() 메소드는 컬렉션으로부터 병렬 스트림을 바로 리턴한다.
		MaleStudent maleStudent = totalList.parallelStream()
				//필터메소드로으로 남자를 걸러낸다
				.filter(s->s.getSex() == Student.Sex.MALE)
				//컬렉션(MaleStudent는 new(생성자), accumulate, combine를 참조한다.)
				.collect(MaleStudent :: new, 
						MaleStudent :: accumulate, 
						MaleStudent :: combine);
		
		
		maleStudent.getList().stream()
			.forEach(s -> System.out.println(s.getName()));
		
	}

}
