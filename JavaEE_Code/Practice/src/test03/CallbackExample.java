package test03;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallbackExample {
	private ExecutorService executorService;
	
	public CallbackExample() {
		executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
	}
	//Integer -> 결과 타입 Void -> 첨부 타입
	private CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>(){

		@Override
		//Integer -> 결과 타입 Void -> 첨부 타입
		public void completed(Integer result, Void attachment) {
			System.out.println("completed() 실행: " + result);
		}

		@Override
		//Throwable -> 예외 타입 Void -> 첨부 타입
		public void failed(Throwable exc, Void attachment) {
			System.out.println("failed() 실행: " + exc.toString());
		}
	};
	public void doWork(final String x, final String y) {
		Runnable task = new Runnable() {

			@Override
			public void run() {
				try {
					int intX = Integer.parseInt(x);
					int intY = Integer.parseInt(y);
					int result = intX + intY;
					//정상 처리했을 경우 호출
					callback.completed(result, null);
				} catch (NumberFormatException e) {
					//예외가 발생했을 경우 경우 호출
					callback.failed(e, null);
				}
				
			}
			
		};
		//스레드풀에게 작업 처리 요청
		executorService.submit(task);
	}

	public void finish() {
		//스레드풀 종료
		executorService.shutdown();
	}
	
	public static void main(String[] args) {
		CallbackExample example  = new CallbackExample();
		example.doWork("3", "3");
		example.doWork("3", "삼");
		example.finish();
	}
}
