package test11;

public class Student {
	public enum Sex {MALE, FEMALE};
	
	private String name;
	private int score;
	private Sex sex;
	public Student(String name, int score, Sex sex) {
		super();
		this.name = name;
		this.score = score;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	public Sex getSex() {
		return sex;
	}
	

}
