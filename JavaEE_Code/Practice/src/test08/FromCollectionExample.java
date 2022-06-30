package test08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("이성혁", 100),
				new Student("유재석", 95),
				new Student("김경일", 89)
				);
		Stream<Student> stream = studentList.stream();
		stream.forEach(s -> System.out.println(" 이름: " + s.getName() + 
				" 점수: " + s.getScore() + " 클래스: " + s.getClass()));
	}

}
