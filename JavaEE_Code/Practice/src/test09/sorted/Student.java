package test09.sorted;

public class Student implements Comparable<Student>{
	private String name;
	private int score;
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	/*
	 * score < o.score : 음수 리턴
	 * score == o.score : 0 리턴
	 * score > o.score : 양수 리턴
	 */
	@Override
	public int compareTo(Student o) {
		return Integer.compare(score, o.score);
	}
	
	

}
