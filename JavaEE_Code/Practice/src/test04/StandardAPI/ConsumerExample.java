package test04.StandardAPI;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;
/**
 * Cousumer 함수적 인터페이스의 특징은 리턴값이 없는 accept() 메소드를 가지고 있다.
 * accpet() 메소드는 단지 매개값을 소비하는 역할만 한다.
 * 여기서 소비한다는 말은 사용만 할 뿐 리턴값이 없다는 뜻이다.
 * @author sungh
 *
 */
public class ConsumerExample {
	public static void main(String[] args) {
		//매개값으로 T객체 하나를 가지므로 람다식도 한 개의 매개 변수를 사용한다.
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("Java"); //Java8
		
		//매개값으로 T와 U 두 개의 객체를 가지므로 람다식도 두 개의 매개 변수를 사용한다.
		BiConsumer<String, String> bigConsumer = (t,u) -> System.out.println(t + u);
		bigConsumer.accept("Java", "8"); //Java8
		
		//매개값으로 double 하나를  가지므로 람다식도 한 개의 매개 변수를 사용한다.
		DoubleConsumer doubleConsumer = d -> System.out.println("Java" + d);
		doubleConsumer.accept(8.0); //Java8.0
		
		//매개값으로 T 객체와 int 값 두 개를 가지기 떄문에 람다식도 두 개의 매개 변수를 사용한다.
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
		objIntConsumer.accept("Java", 8); //Java8
	}

}
