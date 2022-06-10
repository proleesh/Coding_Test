package test01;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	public static void main(String[] args) {
		//Toolkit객체 얻기
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) { //다섯번 비프음 돌린다
			toolkit.beep(); //비프음 발생 -> 작업 Thread가 담당한다
			try {
				Thread.sleep(500); //0.5초간 정지하다가 진행
			}catch(Exception e){
				
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("띵"); //->메인 Thread가 담당한다
			try {
				Thread.sleep(1000); //1.0초간 정지하다가 진행
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}

}
