package test;

class Car {
	public void go(){//Override 중복쓰기
		System.out.println("GO");
	}
}
class Kia extends Car{
	public void go(){//Override 중복쓰기
		super.go();//父계의 class를 가져오기
		System.out.println("기아차가 달리다.");
	}
}
public class testCar{
	public static void main(String[] args) {
		//Car car = new Car();? 필요없음! super를 사용했기때문에.
		Car kia = new Kia(); //따로 개체를 만들필요 없음
		kia.go();
	}
}
