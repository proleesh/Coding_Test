package test10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
	public static void main(String[] args) {
		List<Student2> totalList = Arrays.asList(
				new Student2("이순신", 10, Student2.Sex.MALE, Student2.City.Seoul),
				new Student2("이성혁", 10, Student2.Sex.MALE, Student2.City.Seongnam),
				new Student2("이미주", 6, Student2.Sex.FEMALE, Student2.City.Seoul),
				new Student2("이주빈", 10, Student2.Sex.FEMALE, Student2.City.Pusan)
				);
		Map<Student2.Sex, List<Student2>> mapBySex = totalList.stream()
				.collect(Collectors.groupingBy(Student2 :: getSex));
		
		System.out.print("[남학생] ");
		mapBySex.get(Student2.Sex.MALE).stream()
			.forEach(s->System.out.print(s.getName() + " "));
		
		System.out.print("[여학생] ");
		mapBySex.get(Student2.Sex.FEMALE).stream()
			.forEach(s->System.out.print(s.getName() + " "));
		
		System.out.println();
		
		Map<Student2.City, List<String>> mapByCity = totalList.stream()
				.collect(
						Collectors.groupingBy(
								Student2::getCity,
								Collectors.mapping(Student2::getName, Collectors.toList())
								)
						);
		System.out.print("\n[서울] ");
		mapByCity.get(Student2.City.Seoul).stream().forEach(s->System.out.print(s + " "));
		
		System.out.print("\n[성남] ");
		mapByCity.get(Student2.City.Seongnam).stream().forEach(s->System.out.print(s + " "));
		
		System.out.print("\n[부산] ");
		mapByCity.get(Student2.City.Pusan).stream().forEach(s->System.out.print(s + " "));
				
	}

}
