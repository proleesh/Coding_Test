package test03.Generic;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		//String -> Object (자동 타입 변환)
		box.setT("홍길동");
		//Object -> String (강제 타입 변환)
		//String name = (String)box.getT();
		String name = box.getT();
		
		Box<Integer> box2 = new Box<Integer>();
		//자동 Boxing
		box2.setT(4);
		//자동 UnBoxing
		int value = box2.getT();
	}

}
