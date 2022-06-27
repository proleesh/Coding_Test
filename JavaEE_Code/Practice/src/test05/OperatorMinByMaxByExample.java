package test05;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {
	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;
		/**
		 * Integer.compare()는 첫 번째 매개값이 두 번째 매개값보다 작으면 음수,
		 * 같으면 0, 크면 양수를 리턴한다.
		 */
		binaryOperator = BinaryOperator.minBy((f1, f2)->Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("딸기", "850g", 6000), new Fruit("수박", "1.2kg", 10000));
		System.out.println(fruit.fruitName + " " + fruit.fruitSize + " " + fruit.price);
		
		binaryOperator = BinaryOperator.maxBy((f1, f2)->Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("딸기", "850g", 6000), new Fruit("수박", "1.2kg", 10000));
		System.out.println(fruit.fruitName + " " + fruit.fruitSize + " " + fruit.price);
	}

}
