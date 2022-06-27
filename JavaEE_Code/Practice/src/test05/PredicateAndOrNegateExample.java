package test05;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {
	public static void main(String[] args) {
		//2의 배수 검사
		IntPredicate predicateA = a -> a%2 == 0;
		
		//3의 배수 검사
		IntPredicate predicateB = (a) -> a%3 == 0;
		
		IntPredicate predicateAB;
		boolean result;
		
		//and()
		/**
		 * and()메소드는 두 Predicate가 모두 true를 리턴하면 최종적으로 true를 리턴하는
		 * Predicate를 생성한다.
		 */
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2와 3의 배수입니까? " + result);
		
		//or()
		/**
		 * or()메소드는 두 Predicate 중 하나만 true를 리턴하더라도 최종적으로 true를 리턴하는
		 * Predicate를 생성한다.
		 */
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2와 3의 배수입니까? " + result);
		
		//negate()
		/**
		 * negate()메소드는 두 Predicate의 결과가 true이면 false로, false이면 true를 리턴하는
		 * Predicate를 생성한다.
		 */
		predicateAB = predicateB.negate();
		result = predicateAB.test(9);
		System.out.println("9는 홀수입니까? " + result);
		
	}

}
