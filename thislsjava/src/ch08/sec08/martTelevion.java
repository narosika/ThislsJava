package ch08.sec08;

public class martTelevion implements RemoteControl, Searchable{
	//추상메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다");
	}
	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다");
	}
	//서치드 추상메소드 오버라이딩
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다");
	}
}
