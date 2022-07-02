package test09;

import java.util.Arrays;
import java.util.List;

public class MapExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 10),
				new Student("이성혁", 20),
				new Student("이순신", 30)
				);
		
		studentList.stream()
//		.filter(n -> n.getName() == "이순신")
		.filter(n -> n.getName() == "홍길동")
		.mapToInt(Student :: getScore)
		.forEach(score -> System.out.println(score));
		
	}

}
