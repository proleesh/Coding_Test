package test05.MethodReferences;

import java.util.function.BiFunction;
import java.util.function.Function;


public class ConstructorRerencesExample {
	public static void main(String[] args) {
		//생성자 참자  클래스 :: new
		Function<String, Member> function1 = Member :: new;
		//parameter 하나
		Member member1 = function1.apply("angel");
		
		BiFunction<String, String, Member> function2 = Member :: new;
		//parameter 두개
		Member member2 = function2.apply("신천사", "angel");
		
	}

}
