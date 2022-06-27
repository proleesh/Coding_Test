package test05;

import java.util.function.Function;

public class FunctionAndThenComposeExample {
	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;
		String name;

		functionA = (m) -> m.getAddress();
		functionB = (a) -> a.getCity();

		functionAB = functionA.andThen(functionB);
		city = functionAB.apply(new Member("이성혁", "lee", new Address("한국", "서울")));
		System.out.println("거주 도시: " + city);
		
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(new Member("이성혁", "lee", new Address("한국", "서울")));
		System.out.println("거주 도시: " + city);
		

	}

}
