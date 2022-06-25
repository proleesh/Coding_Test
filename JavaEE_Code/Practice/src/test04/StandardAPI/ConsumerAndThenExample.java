package test04.StandardAPI;

import java.util.function.Consumer;

public class ConsumerAndThenExample {
	public static void main(String[] args) {
		Consumer<Member> consumerA = (m) -> {
			System.out.println("consumerA: " + m.getName());
		};
		
		Consumer<Member> consumerB = (m) -> {
			System.out.println("consumerB: "+ m.getId());
		};
		
		/**
		 * interfaceAB의 method()를 호출하면 우선 interfaceA부터 처리하고 
		 * 결과를 인터페이스B의 매개값으로 제공한다. interfaceB는 제공받는 매개값
		 * 을 가지고 처리한 후 최종 결과를 리턴한다.
		 */
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("홍길동", "hong", null));
		
		
	}

}
