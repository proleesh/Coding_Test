package test02;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start(); //Thread 시작 -> SumThread.java에 run()이 작업한다.
		
		
		try {
			sumThread.join();//sumThread가 종료될 때 까지 메인 스레드를 일시 정지시킴
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("1-100 합: " + sumThread.getSum());

	}

}
