package JhStude.EX.sec155.Assount;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Account> accArray = new ArrayList<Account>();
	public static void main(String[] args) {
		
		while (true){
			System.out.println("-------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌확인 | 3.예금하기 | 4.출금하기 | 5.종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택: ");
			int selet = Integer.parseInt(sc.nextLine());
			
			if(selet == 1) {
				newAccount();
			} else if (selet == 2) {
				cheackAcc();
			} else if (selet == 3) {
				plusAcc();
			} else if (selet == 4) {
				minusAcc();
			} else if (selet == 5) {
				break;
			} else {
				System.out.println("잘못된 숫자입니다 다시 입력해주세요");
			}
		}
		
	}
	//계좌생성 메소드
	public static void newAccount() {
		System.out.println("-------------");
		System.out.println("계좌생성");
		System.out.println("-------------");
	
		System.out.print("계좌번호");
		String accNum = sc.nextLine();
		System.out.print("이름");
		String name = sc.nextLine();
		System.out.println("초기 입금액");
		int money = Integer.parseInt(sc.nextLine());
		
		Account acc = new Account(accNum, name, money);	
		accArray.add(acc);
	}
	//계좌확인 메소드
	public static void cheackAcc() {
		System.out.println("-------------");
		System.out.println("계좌확인");
		System.out.println("-------------");
		
		for(Account x:accArray) {
			System.out.print(x.getAccNum());
			System.out.print("    ");
			System.out.print(x.getName());
			System.out.print("    ");
			System.out.println(x.getMoney());
		}
	}
	//계좌매치 메소드
	public static Account matchAcc (String accCh) {
		Account chAcc = null;
		for(Account x:accArray) {
			if(x.getAccNum().equals(accCh)) {
				chAcc = x;
			}
		}
		return chAcc;
	}
	//계좌입금 메소드
	public static void plusAcc() {
		System.out.println("-------------");
		System.out.println("계좌입금");
		System.out.println("-------------");
		
		System.out.println("계좌번호");
		String accCh = sc.nextLine();
		System.out.println("입금액: ");
		int addmoney = Integer.parseInt(sc.nextLine());
		if(addmoney>Account.MAXADD) {
			System.out.println("1회 입금액을 초과하였습니다");
		}
		
		Account matAcc = matchAcc(accCh);
		if(matAcc == null) {
			System.out.println("없는 계좌번호 입니다");
			return;
		}
	
		matAcc.setMoney(addmoney + matAcc.getMoney());
		System.out.println("입금에 성공했습니다   잔액:"+matAcc.getMoney());
	}
	//계좌출금 메소드
	public static void minusAcc() {
		System.out.println("-------------");
		System.out.println("계좌출금");
		System.out.println("-------------");
		
		System.out.println("계좌번호");
		String accCh = sc.nextLine();
		System.out.println("입금액: ");
		int minusMoney = Integer.parseInt(sc.nextLine());
		if(minusMoney>Account.MAXADD) {
			System.out.println("1회 출금가능액을 초과하였습니다");
		}
		
		Account matAcc = matchAcc(accCh);
		if(matAcc == null) {
			System.out.println("없는 계좌번호 입니다");
			return;
		}
	
		matAcc.setMoney(minusMoney + matAcc.getMoney());
		System.out.println("출금에 성공했습니다   잔액:"+matAcc.getMoney());
	}
}
