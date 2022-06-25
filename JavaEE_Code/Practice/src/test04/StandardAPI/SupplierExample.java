package test04.StandardAPI;

import java.util.function.IntSupplier;
/**
 * Supplier 함수적 인터페이스의 특징은 매개 변수가 없고 리턴값이 있는 getXXX() 메소드를 가지고 있다.
 * 이 메소드들은 실행 후 호출한 곳으로 데이터를 리턴(공급)하는 역할을 한다.
 * @author sungh
 *
 */
public class SupplierExample {
	public static void main(String[] args) {
		//람다식
		IntSupplier intSupplier = () -> {
			int num = (int) (Math.random() * 6) + 1;
			return num;
		};
		
		int num = intSupplier.getAsInt();
		System.out.println("눈의 수: " + num);
	}

}
