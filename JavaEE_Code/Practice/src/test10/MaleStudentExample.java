package test10;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {
	public static void main(String[] args) {
		List<Student2> totalList = Arrays.asList(
				new Student2("이재용", 10, Student2.Sex.MALE),
				new Student2("이주빈", 6, Student2.Sex.FEMALE),
				new Student2("이미주", 4, Student2.Sex.FEMALE),
				new Student2("김범수", 10, Student2.Sex.MALE)
				);
		
		MaleStudent maleStudent = totalList.stream()
				.filter(s -> s.getSex() == Student2.Sex.MALE)
				.collect(MaleStudent :: new, 
						MaleStudent :: accumulate, 
						MaleStudent :: combine
						);
		
		
		maleStudent.getList().stream()
		.forEach(s -> System.out.println(s.getName()));
	}

}
