package test;

class Car {
	public void go(){//Override �ߺ�����
		System.out.println("GO");
	}
}
class Kia extends Car{
	public void go(){//Override �ߺ�����
		super.go();//ݫ���� class�� ��������
		System.out.println("������� �޸���.");
	}
}
public class testCar{
	public static void main(String[] args) {
		//Car car = new Car();? �ʿ����! super�� ����߱⶧����.
		Car kia = new Kia(); //���� ��ü�� �����ʿ� ����
		kia.go();
	}
}
