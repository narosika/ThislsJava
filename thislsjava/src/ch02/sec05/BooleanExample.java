package ch02.sec05;

public class BooleanExample
{

	public static void main(String[] args) 
	{
		//논리타입 조건문 변수 만들기
		boolean stop = true;
		if(stop)
		{
			System.out.println("중지합니다");	//stop가 ture인 상태면 중지합니다를 출력해라
		}
		else
		{
			System.out.println("시작합니다");	//stop이 ture가 아니면 상태면 시작합니다를 출력해라
		}
		
		int x = 10;
		boolean result1 = (x == 20);	//변수 x의 값이 20인가?
		boolean result2 = (x != 20);	//변수 x의 값이 20이 아닌가?
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
	}

}
