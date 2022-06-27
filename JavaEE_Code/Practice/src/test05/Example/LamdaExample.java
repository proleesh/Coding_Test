package test05.Example;

import java.util.function.IntSupplier;

public class LamdaExample {
	public static int method(int x, int y){
		IntSupplier supplier = () -> {
			int x1 = x * 10;
			int result = x1 + y;
			return result;
		};
		int result = supplier.getAsInt();
		return result;
	}
	public static void main(String[] args) {
		System.out.println(method(3,5));
	}

}
