package test01;

public class ThreadNameExample {
	public static void main(String[] args) {
		//이 코드를 실행하는 현재 스레드(current thread) 객체 얻기
		Thread mainThread = Thread.currentThread();
		//getName()메서드는 스레드 이름을 얻는다
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름: " + threadA.getName());
		threadA.start(); //ThreadA 시작
		
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름: " + threadB.getName());
		threadB.start(); //ThreadB 시작
		
		//결론: 이름을 설정한 ThreadA는 'ThreadA'로 출력이 된다.
		//이름을 설정 안한 ThreadB는 'Thread-1'로 출력이된다.   
		//Thread-num 번호를 자동으로 붙여서 출력이 된다.
	}

}
