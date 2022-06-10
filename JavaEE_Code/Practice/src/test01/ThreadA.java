package test01;

public class ThreadA extends Thread{
	public ThreadA() {
		//ThreadA 이름 설정
		setName("ThreadA");
	}

	@Override
	public void run() {
		//ThreadA 실행 내용
		for(int i=0; i<10; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
	

}
