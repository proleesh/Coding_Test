package test01;

import java.awt.Toolkit;

public class LamdaBeepPrintEx {
	public static void main(String[] args) {
		Thread thread = new Thread(() -> {
			Toolkit tk = Toolkit.getDefaultToolkit();
			for(int a=0; a<5; a++) {
				tk.beep();
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		});
	}

}
