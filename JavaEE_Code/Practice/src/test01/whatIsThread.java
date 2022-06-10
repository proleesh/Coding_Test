package test01;

public class whatIsThread {
	public static void main(String[] args) {
		Thread thread = new Thread(() ->{
			//스레드가 실행할 코드
		});
		
		//반드시 start() 메서드를 써야 Thread가 호출이 된다.
		thread.start();
	}
	

}

