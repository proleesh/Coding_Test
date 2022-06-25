package test04.StandardAPI;

public class RunnableExample {
	public static void main(String[] args) {
//		//람다식(스레드가 실행하는 코드)
//		Runnable runnable = ()->{
//			for(int i=0; i<10; i++) {
//				System.out.println(i);
//			}
//		};
//
//		
//		Thread thread = new Thread(runnable);
//		thread.start();
		
		//이렇게 해도 된다. 똑같은 결과가 나온다.
		Thread thread = new Thread(()->{
			for(int i=0; i<10; i++) {
				System.out.println(i);
			}
		});
		thread.start();
		
	}

}
