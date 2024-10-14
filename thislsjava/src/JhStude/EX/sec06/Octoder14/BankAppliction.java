package JhStude.EX.sec06.Octoder14;

import java.util.Scanner;

public class BankAppliction {
	static Scanner sc = new Scanner(System.in);
	static Account[] accountArray = new Account [100];

	public static void main(String[] args) {
		boolean run = true;
		
		while (run) {
			
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택:> ");
			int selecNum = (Integer.parseInt(sc.nextLine()));
			
			if(selecNum ==1) {
				newAccount();
			}
			else if(selecNum ==2) {
				checkAcc();
			}
			else if(selecNum ==3) {
				plusMoney();
			}
			else if(selecNum ==4) {
				minusMoney();
			}
			else if(selecNum ==5) {
				run = false;
			} else {
				System.out.println("다시 선택해주세요");
			}
		}
		System.out.println("프로그램 종료");
	}
	//계좌생성 메소드
	static void newAccount() {
		System.out.println("-----------");
		System.out.println("계좌생성");
		System.out.println("-----------");
		
		System.out.print("계좌번호: ");
		String accNum = sc.nextLine();
		System.out.print("계좌주: ");
		String name = sc.nextLine();
		System.out.print("초기 입금액: ");
		int money = (Integer.parseInt(sc.nextLine()));
		//어카운드 생성자 호출
		Account acc = new Account(accNum, name, money);
		
		for (int i =0 ; i<accountArray.length ; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = acc;
				return;
			}
		}
	}
	//계좌확인 메소드
	static void checkAcc() {
		System.out.println("-----------");
		System.out.println("계좌확인");
		System.out.println("-----------");
		
		for(int i=0 ; i<accountArray.length ; i++) {
			if(accountArray[i] != null) {
				Account extra = accountArray[i];
				System.out.println(extra.getAccNum() + "\t" + extra.getName() + "\t" + extra.getMoney());
			}
		}
	}
	//계좌번호 확인 메소드
	static Account findAccount(String chAcc) {
		Account exAcc = null;
		for(int i=0 ; i<accountArray.length ; i++) {
			if(accountArray[i] != null) {
				String extraAcc = accountArray[i].getAccNum();
				//입력 받은 계좌번호가 있다면 지금 메소드에 클래스변수를 넣어주고 값이 잘못되면 null 이됨!
				if(extraAcc.equals(chAcc)) {
					exAcc=accountArray[i];
				}
			}
		}
		return exAcc;
	}
	//계좌입금 메소드
	static void plusMoney() {
		System.out.println("-----------");
		System.out.println("예금");
		System.out.println("-----------");
		
		System.out.print("계좌번호: ");
		String chAcc = sc.nextLine();
		System.out.print("입금액: ");
		int pMoney = (Integer.parseInt(sc.nextLine()));
		
		Account find = findAccount(chAcc); //<<---얘가 가지고있는건 주소
		
		if(find ==null) {
			System.out.println("계좌번호가 존재하지 않습니다");
			return;
		}
		find.setMoney(find.getMoney() + pMoney);
		System.out.println(find.getMoney());
	}
	//계좌출금 메소드
	static void minusMoney() {
		System.out.println("-----------");
		System.out.println("출금");
		System.out.println("-----------");
		
		System.out.print("계좌번호: ");
		String chAcc = sc.nextLine();
		System.out.print("출금액: ");
		int mMoney = (Integer.parseInt(sc.nextLine()));
		
		Account find = findAccount(chAcc); //<<---얘가 가지고있는건 주소
		
		if(find ==null) {
			System.out.println("계좌번호가 존재하지 않습니다");
			return;
		}
		if(find.getMoney() < mMoney) {
			System.out.println("출금 신청금액이 너무 많습니다");
			return;
		}
		find.setMoney(find.getMoney() - mMoney);
		System.out.println(find.getMoney());
		System.out.println("출금에 성공했습니다");
	}

}
