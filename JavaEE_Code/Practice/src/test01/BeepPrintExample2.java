package test01;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start(); // thread를 시작하기위해 start()메서드는 반드시 추가해야한다.

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000); // 1.0초마다 정지하다가 진행
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
