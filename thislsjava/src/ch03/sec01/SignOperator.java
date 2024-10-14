package ch03.sec01;

public class SignOperator
{

	public static void main(String[] args) 
	{
		//정수타입을 부호변경을 위해 -연산 하게되면 결과는 int 타입으로 변경된다
		int x = -100;
		x = -x;
		System.out.println("x: " + x);
		//변수 y를 byte 데이터 타입으로 넣을려고 하면 컴파일 에러가 발생
		byte b = 100;
		int y = -b;
		System.out.println("y: " + y);
	}

}
