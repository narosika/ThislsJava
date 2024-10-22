package JhStude.EX.sec06.October16;

import java.util.Scanner;

public class BankApplication {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(true){
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌확인 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택:> ");
			int selecNum = (Integer.parseInt(sc.nextLine()));
			
			if(selecNum == 1) {
				Method.newAccount();
			} else if (selecNum == 2) {
				Method.checkAcc();
			} else if (selecNum ==3) {
				Method.addAcc();
			} else if (selecNum ==4 ) {
				Method.subAcc();
			} else if (selecNum==5) {
				break;
			} else {
				System.out.println("선택번호를 확인해주세요");
			}

		}
		System.out.println("프로그램 종료");
	}

}
