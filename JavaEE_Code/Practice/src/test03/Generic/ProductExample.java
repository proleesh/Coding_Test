package test03.Generic;

public class ProductExample {
	public static void main(String[] args) {

		Product<Tv, String> product1 = new Product<>();
		product1.setKind(new Tv());
		product1.setModel("LG 8KTV");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		Product<Car, String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("BMW");
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
	}

}
