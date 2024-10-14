package JhStude.EX;

import java.util.Scanner;


public class ch04bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int bank = 0;
		
		while(true)
		{
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택: ");
			int selNum = Integer.parseInt(sc.nextLine());
			
			if(selNum ==1)
			{
				System.out.print("예금액: ");
				int plus = Integer.parseInt(sc.nextLine());
				bank += plus;
			}
			else if(selNum==2)
			{
				System.out.print("출금액: ");
				int mm = Integer.parseInt(sc.nextLine());
				bank -= mm;
			}
			else if (selNum==3)
			{
				System.out.println("현재잔액: " +bank);
			}
			else if(selNum==4)
			{
				break;
			}
			
		
		}
		System.out.println("프로그램 종료");
	}
}
