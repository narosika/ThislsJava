package ch14.sec03.exam01;

import java.awt.Toolkit;

public class BeepPrint {

	public static void main(String[] args) {
		beef beef = new beef();
		//스레드 실행
		beef.beef.start();
		//메인스레드실행
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
		
	}

}
