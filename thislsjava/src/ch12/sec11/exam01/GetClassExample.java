package ch12.sec11.exam01;

public class GetClassExample {
	public static void main(String[] args) throws Exception {
		//how1
		Class clazz = Car.class;
		
		//Class clazz = Class.forName("ch12.sec11.exam01.Car");
		//how3
		//Car car = new Car();
		//Class clazz = car.getClass();
		
		//패키지 정보읽기
		System.out.println("패키지: " + clazz.getPackage().getName());
		//패키지를 제외한 타입이름
		System.out.println("클래스 간단이름: " + clazz.getSimpleName());
		//패키지를 포함한 타입이름
		System.out.println("클래스 전체이름: " + clazz.getName());
	}
}
