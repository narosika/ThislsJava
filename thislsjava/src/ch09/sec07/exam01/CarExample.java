package ch09.sec07.exam01;

public class CarExample {
	public static void main(String[] args) {
		//Car 객체 생성
		Car car = new Car();
		
		//익명 자식 객체가 대입된 필드 사용
		car.run1();
		
		//익명 자식 객체가 대입된 로컬 변수 사용
		car.run2();
		
		CarExample ccc = new CarExample();
		ccc.run4();
		
		//익명 자식 객체가 대입된 매개변수 사용
		car.run3(new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체3이 굴러갑니다.");
			}
		});
		//필드에 익명 자식 객체 대입
		Tire tire2 = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체1이 굴러갑니다.");
			};
		};
		
		tire2.roll();
		
	}
	//메소드(로컬변수 이용)
	public void run4() {
		//로컬 변수에 익명 자식 객체 대입
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익타이어 Tire 가 굴러갑니다.");
			}
		};
		tire.roll();
	}
	
	
}
