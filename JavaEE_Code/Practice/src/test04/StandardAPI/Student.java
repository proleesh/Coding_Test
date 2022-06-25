package test04.StandardAPI;

public class Student{
	private String name;
	private int englishScore;
	private int mathScore;
	public Student(String name, int englishScore, int mathScore) {
		super();
		this.name = name;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}
	public Student(String string) {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public int getEnglishScore() {
		return englishScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	
	



}
