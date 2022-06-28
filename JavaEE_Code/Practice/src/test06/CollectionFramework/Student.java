package test06.CollectionFramework;

public class Student {
	public int sno;
	public String name;
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
	//학번과 이름이 같다면 동일한 값을 리턴
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return sno + name.hashCode();
	}
	
	//학번과 이름이 동일한 경우 true를 리턴
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			return (sno == student.sno) && (name.equals(student.name));
		}else {
			return false;
		}
	}
	
	

}
