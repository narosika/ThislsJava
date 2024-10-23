package ch14.sec03.exam01;

import java.awt.Toolkit;

public class beef {
	//스레드생성
	Thread beef = new Thread(new Runnable() {
		@Override
		public void run() {
			Toolkit tool = Toolkit.getDefaultToolkit(); {
					for(int i=0 ; i<5; i++) {
						tool.beep();
						try {Thread.sleep(1000); } catch(Exception e) {}
					}
			}
			
		}
	});
	
}
