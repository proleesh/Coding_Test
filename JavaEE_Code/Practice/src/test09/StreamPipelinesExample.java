package test09;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", Member.MALE, 30),
				new Member("이재용", Member.MALE, 53),
				new Member("김다랑", Member.FEMALE, 18)
				);
		double ageAvg = list.stream() //오리지날 스트림
				.filter(m -> m.getSex() == Member.MALE) //중간 처리 스트림
				.mapToInt(Member :: getAge)
				.average() //최종 처리
				.getAsDouble();
		System.out.println("남자 평균 나이: " + ageAvg);
	}

}
