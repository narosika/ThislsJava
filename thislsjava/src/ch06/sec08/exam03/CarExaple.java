package ch06.sec08.exam03;

public class CarExaple {

	public static void main(String[] args) {
		//Car 객체 생성
		Car mycar = new Car();
		
		//리턴값이 없는 setGas메소드 호출
		mycar.setGas(8);
		
		//isLeftGas메소드를 호출해서 받은 리턴값이 트루 일 경우 if블록실행
		if(mycar.isLeftGas())
		{
			System.out.println("출발합니다");
			
			//리턴값이 없는 run메소드 호출
			mycar.run();
		}
		
		System.out.println("gas를 주입하세요");
		
	}

}
