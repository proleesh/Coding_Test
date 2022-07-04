package test10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {
	public static void main(String[] args) {
		List<Student2> totalList = Arrays.asList(
				new Student2("이재용", 10, Student2.Sex.MALE),
				new Student2("이미주", 6, Student2.Sex.FEMALE),
				new Student2("이순신", 10, Student2.Sex.MALE),
				new Student2("이주빈", 6, Student2.Sex.FEMALE)
				);
		//남학생들만 묶어 List 생성
		List<Student2> maleList = totalList.stream()
				.filter(s -> s.getSex()==Student2.Sex.MALE)
				.collect(Collectors.toList());
		maleList.stream()
		.forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
		//여학생들만 묶어 HashSet 생성
		Set<Student2> femaleSet = totalList.stream()
				.filter(s -> s.getSex()==Student2.Sex.FEMALE)
				.collect(Collectors.toCollection(HashSet :: new));
		femaleSet.stream()
			.forEach(s -> System.out.println(s.getName()));
	}

}
