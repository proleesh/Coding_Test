package test07.Example;

public class Student {
	public int studentNum;
	public String name;
	public Student(int studentNum, String name) {
		super();
		this.studentNum = studentNum;
		this.name = name;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentNum;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			//학번이 같으면 중복되지 않게
			return studentNum == student.studentNum;
		}else {
			return false;
		}
	}
	
	
	
	

}
