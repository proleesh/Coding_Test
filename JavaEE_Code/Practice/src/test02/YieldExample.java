package test02;

public class YieldExample {
	public static void main(String[] args) {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		//ThreadA, ThreadB 모두 실행
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		threadA.work = false; //ThreadB만 실행
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		threadA.work = true; //ThreadA, ThreadB 모두 실행
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		threadA.stop = true;
		threadB.stop = true;//ThreadA, ThreadB 모두 종료
	}

}
