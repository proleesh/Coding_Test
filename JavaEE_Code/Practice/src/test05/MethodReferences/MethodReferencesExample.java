package test05.MethodReferences;

import java.util.function.IntBinaryOperator;
/**
 * 메소드 참조를 쓰는 이유는 람다식 처럼 복잡하게 할 필요없이 매우 깔끔하게 처리할 수 있다.
 * @author sungh
 *
 */
public class MethodReferencesExample {
	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		//정적 메소드 참조
		/**
		 * 정적(static) 메소드를 참조할 경우에는 클래스 이름 뒤에 :: 기호를 붙이고 정적 메소드 이름을 기술하면
		 * 된다.
		 * 클래스(class) :: 메소드(method)
		 */
		operator = (x, y) -> Calculator.staticMethod(x, y);
		System.out.println("결과1: " + operator.applyAsInt(1, 2));
		
		operator = Calculator :: staticMethod;
		System.out.println("결과2: " + operator.applyAsInt(3, 4));
		
		//인스턴스 메소드 참조
		/**
		 * 인스턴스(instance) 메소드일 경우에는 먼저 객체를 생성한 다음 참조 변수 뒤에 :: 기호를 붙이고
		 * 인스턴스 메소드 이름을 기술하면 된다.
		 * 참조변수(Reference Variable) :: 메소드(method)
		 */
		Calculator obj = new Calculator();
		operator = (x, y) -> obj.instanceMethod(x, y);
		System.out.println("결과3: " + operator.applyAsInt(5, 6));
		
		operator = obj :: instanceMethod;
		System.out.println("결고4: " + operator.applyAsInt(7, 8));
	}

}
