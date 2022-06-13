package test02.StopFlag;

public class InterrupExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		//Thread를 종료시키기 위해 InterruptException을 발생시킴
		thread.interrupt();
	}

}
