package test02.WorkObject;

public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject();//공유 객체 생성
		
		//ThreadA 와 ThreadB 생성
		ThreadA threadA = new ThreadA(sharedObject);
		ThreadB threadB = new ThreadB(sharedObject);
		
		//ThreadA 와 ThreadB 시작
		threadA.start();
		threadB.start();
	}

}
