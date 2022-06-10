package test01;

public class User1 extends Thread{
	private Calculator calculator;


	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(100); //공유 객체인 Calculator의  메모리에 100을 저장
	}
	

}
