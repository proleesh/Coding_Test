package test05;

public class Fruit {
	public String fruitName;
	public String fruitSize;
	public int price;
	
	public Fruit(String fruitName, String fruitSize, int price) {
		super();
		this.fruitName = fruitName;
		this.fruitSize = fruitSize;
		this.price = price;
	}
	public String getFruitName() {
		return fruitName;
	}
	public String getFruitSize() {
		return fruitSize;
	}
	public int getPrice() {
		return price;
	}

	

}
