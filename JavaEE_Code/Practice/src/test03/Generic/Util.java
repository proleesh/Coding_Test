package test03.Generic;

public class Util {
	/**
	 * 명시적으로 구체적 타입을 지정:
	 * 리턴타입 변수 = <구체적타입> 메소드명(매개값);
	 * 예: RType<Integer> rt = <Integer>boxing(100);
	 * 매개값을 보고 구체적 타입을 추정:
	 * 리턴타입 변수 = 메소드명(매개값);
	 * 예: RType<Integer> rt = boxing(100);
	 */
	//boxing()을 정의하고 BoxingMethodExample 클래스에서 호출
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.setT(t);
		return box;
		
	}
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
	}

}
