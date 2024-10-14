package JhStude.exem;

import java.util.Scanner;

public class Ex10 {
//김정호
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bank = 0;
		boolean run = true;
		
		//김정호
		//프로그램실행
		while(run)
		{
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택:> ");
			
			int selecNum = sc.nextInt();
			
			//1번을 누르면 입금
			if(selecNum==1)
			{
				System.out.print("예금액:> ");
				int plus = sc.nextInt();
				
				bank += plus;
				System.out.println("현재잔고: " + bank);
			}
			//2번을 누르면 출금
			else if(selecNum==2)
			{
				System.out.print("출금액:> ");
				int minus = sc.nextInt();
				
				bank -= minus;
				System.out.println("현재잔고: " + bank);
	
			}
			//3번을 누르면 잔액확인
			else if(selecNum==3)
			{
				System.out.println("잔액: " + bank);
			}
			//4번을 누르면 프로그램 종료
			else if(selecNum==4)
			{
				run = false;
			}
			//다른번호를 누르면 재입력
			else
			{
				System.out.println("잘못된 선택입니다 다시 입력해주세요");
			}
		}
		System.out.println("프로그램 종료");
	}
}
