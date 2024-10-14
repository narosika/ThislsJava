package ch02.sec11;

import java.util.Scanner;

public class VariableScopeExample
{

	public static void main(String[] args) 
	{
		//외부에서 키보드 입력으로 변수 받기
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x 값 입력: ");
		String strX = scanner.nextLine();  //키보드로 입력받는 값을 문자로 받음
		int x = Integer.parseInt(strX);    //받은 문자값을 숫자로 변환함
		
		System.out.print("y 값 입력: ");
		int y = scanner.nextInt();  		//키보드로 받은 값을 숫자로 받음
		
		int result = x + y;
		System.out.println("x + y: " + result);
		System.out.println();
	}

}
