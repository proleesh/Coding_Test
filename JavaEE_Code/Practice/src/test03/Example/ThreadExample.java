package test03.Example;

public class ThreadExample {
	public static void main(String[] args) {
		Thread thread1 = new MovieThread();
		//setDaemon 메인 스레드가 종료하면 MovieThread도 같이 종료되게 한다.
		//setDaemon는 강제적으로 자동 종료한다.
		thread1.setDaemon(true);
		thread1.start();
		
		Thread thread2 = new Thread(new MovieRunnable());
		thread2.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		Thread.interrupted();
	}

}
