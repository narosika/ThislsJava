package ch14.sec06.exam01;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}
	//---------------동기화메소드-------------------
	public synchronized void setMemory1(int memory) {
		this.memory = memory;			//메모리값 저장
		try {
			Thread.sleep(2000);			//2초간 일시정지
		} catch(InterruptedException e) {}	
		System.out.println(Thread.currentThread().getName() + ": " +  this.memory);
	}
	//-------------------여기까지--------------
	
	public void setMemory2(int memory) {
		//---------------동기화 블럭-------------
		synchronized(this) {
			this.memory = memory;			//메모리값 저장
			try {
				Thread.sleep(2000);			//2초간 일시정지
			} catch(InterruptedException e) {}	
			System.out.println(Thread.currentThread().getName() + ": " +  this.memory);
		}
		//-----------------여기까지--------------
	}	
}


