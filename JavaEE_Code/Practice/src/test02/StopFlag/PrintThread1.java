package test02.StopFlag;

public class PrintThread1 extends Thread{
	private boolean stop;

	public synchronized void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		while(!stop) {
			System.out.println("실행 중");
		}
		//다음은 stop가 true일 때 실행함
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
	
	

}
