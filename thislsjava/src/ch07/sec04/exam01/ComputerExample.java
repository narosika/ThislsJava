package ch07.sec04.exam01;

public class ComputerExample {

	public static void main(String[] args) {
		
		int r= 10;
		Computer com = new Computer();
		System.out.println("원면적: " + com.areaCircle(r));
		
		Calculator cal = new Calculator();
		System.out.println("원면적: " + cal.areaCircle(r));
	}
}
