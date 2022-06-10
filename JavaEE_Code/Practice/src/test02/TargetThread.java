package test02;

public class TargetThread extends Thread{

	@Override
	public void run() { //[객체생성] NEW 상태를 유지
		for(long i=0; i<1000000000; i++) {//[실행대기]RUNNABLE 상태를 유지
			
		}
		try {
			Thread.sleep(500);//[일시정지]TIMED_WAITING 상태를 유지
		} catch (Exception e) {
			// TODO: handle exception
		}
		for(long i=0; i<1000000000; i++) {} //다시 [실행대기]RUNNABLE 상태를 유지
		
	}//[종료] TERMINATED 상태를 유지
	

}
