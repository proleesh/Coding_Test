package test03.Example;

public class MovieThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("동영상을 재생합니다.");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				break;
			}
			//interrupt 발생시 빠져나오기
			if (Thread.interrupted()) {
				break;
			}
		}
	}

}
