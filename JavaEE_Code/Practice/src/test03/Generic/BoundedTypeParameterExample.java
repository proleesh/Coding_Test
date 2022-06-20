package test03.Generic;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		
		//int type인 10을 Integer type으로 자동 Boxing
		int result1 = Util.compare(10, 20);
		System.out.println(result1);
		
		//double type인 4.5는 Double type으로 자동 Boxing
		int result2 = Util.compare(4.5, 3);
		System.out.println(result2);
	}

}
