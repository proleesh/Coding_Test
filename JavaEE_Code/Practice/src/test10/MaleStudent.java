package test10;

import java.util.ArrayList;
import java.util.List;

public class MaleStudent {
	private List<Student2> list; //요소를 저장할 컬렉션
	
	public MaleStudent() {
		list = new ArrayList<Student2>();
		//생성자 호출하는 스레드 이름
		System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent()");
		
	}
	
	//요소를 수집하는 메소드
	public void accumulate(Student2 student) {
		list.add(student);
		//accumulate()를 호출할 스레드 이름
		System.out.println("[" + Thread.currentThread().getName() + "] accumulate()");
	}
	
	//두 MaleStudent를 결합하는 메소드 (병렬 처리 시에만 호출)
	public void combine(MaleStudent orther) {
		list.addAll(orther.getList());
		//combine()을 호출한 스레드 이름
		System.out.println("[" + Thread.currentThread().getName() + "] combine()");
	}

	//요소가 저장된 컬렉션을 리턴
	public List<Student2> getList() {
		// TODO Auto-generated method stub
		return list;
	}

}
