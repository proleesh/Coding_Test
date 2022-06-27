package test05.MethodReferences;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferencesExample {
	public static void main(String[] args) {
		ToIntBiFunction<String, String> function;
		/**
		 * 비교하기 위해 사용된 메소드는 String의 인스턴스 메소드인 compareToIgnoreCase()이다.
		 * a.compareToIgnoreCase(b)로 호출된 때 사진 순으로 a가 b보다 먼저 오면 음수,
		 * 동일하면 0, 나중에 오면 양수를 리턴한다.
		 */
		function = (a, b) -> a.compareToIgnoreCase(b);
		print(function.applyAsInt("Java8", "JAVA8"));
		
		function = String :: compareToIgnoreCase;
		print(function.applyAsInt("Java8", "JAVA8"));
	}

	public static void print(int order) {
		if(order<0) {
			System.out.println("사전순으로 먼저 옵니다.");
		}else if(order==0) {
			System.out.println("동일한 문자열입니다.");
		}else {
			System.out.println("사전순으로 나중에 옵니다.");
		}
		
		
	}

}
