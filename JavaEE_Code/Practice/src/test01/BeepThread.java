package test01;

import java.awt.Toolkit;

public class BeepThread extends Thread{

	@Override
	public void run() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			tk.beep();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
}

