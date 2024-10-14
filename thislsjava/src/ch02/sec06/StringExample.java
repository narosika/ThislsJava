package ch02.sec06;

public class StringExample 
{

	public static void main(String[] args)
	{
		//문자열 변수 예제 만들기
		String name = "김정호";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\"를 배웁니다";
		System.out.println(str);
		
		str = "번호\t이름\t직업 "; //str 변수를 번호	이름	직업 이 출력될수있게 변경한다
		System.out.println(str);

		System.out.print("나는");
		System.out.print("자바를");
		
		System.out.print("나는\n");  //\n을 넣어줄경우 줄바꿈이 가능하다
		System.out.print("자바를\n");
		System.out.print("배웁니다");
	}

}
