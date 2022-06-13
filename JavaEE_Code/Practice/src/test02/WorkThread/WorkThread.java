package test02.WorkThread;

public class WorkThread extends Thread{

	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(getName() + " interrupted");
				break;
			}
			System.out.println(getName() + " 종료됨");
		}
	}
	
	

}
