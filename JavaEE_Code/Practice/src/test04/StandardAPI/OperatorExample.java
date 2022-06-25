package test04.StandardAPI;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 92, 95, 87 };
	
	//maxOrMin() 메소드는 IntBinaryOperator 매개 변수를 가지고 있다.
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0]; //목표값 설정
		for (int score : scores) {
			// 람다식{} 실행
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		// 최대값 얻기
		int max = maxOrMin((a, b) -> {
			if (a >= b)
				return a;
			else
				return b;
		});
		System.out.println("최대값: " + max);

		// 최소값 얻기
		int min = maxOrMin((a, b) -> {
			if (a <= b)
				return a;
			else
				return b;
		});
		System.out.println("최소값: " + min);
	}

}
