package ch14.sec06.exam01;

public class User2Thread extends Thread {	
	private Calculator calculator;
	
	public User2Thread() {
		setName("User2Thread");
	}	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	@Override
	public void run() {
		calculator.setMemory2(50);	//컬클래스 메모리필드에 50저장
	}
}


