package test01;

public class ThreadB extends Thread{
//	public ThreadB() {
//		//ThreadB 이름 설정
//		setName("ThreadB");
//	}

	@Override
	public void run() {
		for(int a=0; a<10; a++) {
			//ThreadB 실행 내용
			System.out.println(getName() + "가 출력한 내용");
		}
	}
	

}
