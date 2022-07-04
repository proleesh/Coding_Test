package test10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndReductionExample {
	public static void main(String[] args) {
		List<Student2> totalList = Arrays.asList(
				new Student2("이성혁", 10, Student2.Sex.MALE),
				new Student2("김수미", 10, Student2.Sex.FEMALE), 
				new Student2("신용권", 8, Student2.Sex.MALE),
				new Student2("이수진", 7, Student2.Sex.FEMALE));

		// 성별로 평균 점수를 저장하는 Map 얻기
		Map<Student2.Sex, Double> mapBySex = totalList.stream()
				.collect(Collectors.groupingBy(Student2::getSex,
						Collectors.averagingDouble(Student2::getScore)));
		
		System.out.println("남학생 평균 점수: " + mapBySex.get(Student2.Sex.MALE));
		System.out.println("여학생 평균 점수: " + mapBySex.get(Student2.Sex.FEMALE));
		
		// 성별을 쉼표로 구분한 이름을 저장하는 Map 얻기
		Map<Student2.Sex, String> mapByName = totalList.stream()
				.collect(
						Collectors.groupingBy(
								Student2 :: getSex,
								Collectors.mapping(
										Student2 :: getName,
										Collectors.joining(",")
										)
								)
						);
		
		System.out.println("남학생 전체 이름: " + mapByName.get(Student2.Sex.MALE));
		System.out.println("여학생 전체 이름: " + mapByName.get(Student2.Sex.FEMALE));
		
	}

}
