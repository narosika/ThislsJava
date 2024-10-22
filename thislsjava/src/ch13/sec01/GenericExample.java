package ch13.sec01;

public class GenericExample {
	public static void main(String[] args) {
		//Box<String> box1 = new Box<String>();
		Box<String> box1 = new Box<>();
		box1.content = "안녕제네릭";
		String str = box1.content;
		System.out.println(str);
		
		//Box<Integer> box2 = new Box<Integer>();
		Box<Integer> box2 = new Box<>();
		box2.content = 100;
		long value = box2.content;	//자동타입변환 가능, 반대의경우 강제타입변환 해줘야함
		System.out.println(value);
	}
}
