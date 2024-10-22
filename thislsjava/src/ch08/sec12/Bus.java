package ch08.sec12;

public class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	//Bus 클래스만 가지고 있는 메소드
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}
