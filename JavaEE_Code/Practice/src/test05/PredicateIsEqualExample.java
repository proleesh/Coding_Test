package test05;

import java.util.function.Predicate;

public class PredicateIsEqualExample {
	public static void main(String[] args) {
		Predicate<String> predicate;
		/**
		 * isEqual() 메소드는 test() 매개값인 sourceObject와 isEqual()의 매개값인
		 * targetObject를 java.util.Objects 클래스의 equals()의 매개값으로 제공하고,
		 * Object.equals(sourceObject,targetObject)의 리턴값을 얻어 새로운 
		 * Predicate<T>를 생성한다.
		 */
		predicate = Predicate.isEqual(null);
		System.out.println("null, null: " + predicate.test(null));
		
		predicate = Predicate.isEqual("Java8");
		System.out.println("null, Java8: " + predicate.test(null));
		
		predicate = Predicate.isEqual(null);
		System.out.println("Java8, null: " + predicate.test("Java8"));
		
		predicate = Predicate.isEqual("Java8");
		System.out.println("Java8, Java8: "+ predicate.test("Java8"));
		
		predicate = Predicate.isEqual("Java8");
		System.out.println("Java7, Java8: "+ predicate.test("Java7"));
		
	}

}
