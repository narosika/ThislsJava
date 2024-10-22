package JhStude.EX.sec06.October16;

import java.util.Scanner;

public class Method {
	static Scanner sc = new Scanner(System.in);
	static Account[] accArray = new Account[100];
	
	static void newAccount() {
		System.out.println("-----------------");
		System.out.println("계좌생성");
		System.out.println("-----------------");
		
		System.out.print("계좌번호: ");
		String accNum = sc.nextLine();
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("초기 입금액: ");
		int money = (Integer.parseInt(sc.nextLine()));
		
		Account acc = new Account(accNum, name, money);
		
		for (int i=0 ; i<accArray.length ; i++) {
			if(accArray[i] == null) {
				accArray[i] = acc;
				break;
			}
			
		}
	}
	
	static void checkAcc () {
		System.out.println("-----------------");
		System.out.println("계좌확인");
		System.out.println("-----------------");
		
		for(int i=0 ; i<accArray.length ; i++) {
			if(accArray[i] != null) {
				Account exAcc = accArray[i];
				System.out.println(exAcc.getAccNum() + "\t" + exAcc.getName() + "\t" + exAcc.getMoney());
			}
		}
	}
	
	
	static Account comAcc(String accArr) {
		Account numAcc = null;
		for (int i=0 ; i<accArray.length ; i++) {
			if(accArray[i] != null) {
				Account arrAcc = accArray[i];
				if(arrAcc.getAccNum().equals(accArr)) {
					numAcc = arrAcc;
				}
			}
		}
		return numAcc;
	}
	
	
	static void addAcc() {
		System.out.println("-----------------");
		System.out.println(" 예금");
		System.out.println("-----------------");
		
		System.out.print("계좌번호: ");
		String accArr = sc.nextLine();
		System.out.print("입금액: ");
		int mo = (Integer.parseInt(sc.nextLine()));
		if (mo > Account.MAXADD) {
			System.out.println("1회 입금액을 초과 하였습니다");
			return;
		} else if(mo<Account.LIMITMO) {
			System.out.println("입금액은 음수가 될수 없습니다.");
		}
		
		Account plus = comAcc(accArr);
		if(plus.getAccNum() == null) {
			System.out.println("계좌번호가 틀렸습니다");
			return;
		}
		plus.setMoney(plus.getMoney() + mo);
	}

	static void subAcc() {
		System.out.println("-----------------");
		System.out.println(" 출금");
		System.out.println("-----------------");
		
		System.out.print("계좌번호: ");
		String accArr = sc.nextLine();
		System.out.print("출금액: ");
		int mo = (Integer.parseInt(sc.nextLine()));
		if(mo>Account.MAXADD) {
			System.out.println("1회 출금신청 금액을 초과하였습니다");
			return;
		}
		
		Account sub = comAcc(accArr);
		if(sub.getAccNum() == null) {
			System.out.println("계좌번호가 틀렸습니다");
			return;
		}
		if (sub.getMoney()<mo) {
			System.out.println("출금 신청금액이 너무 많습니다");
			return;
		}
		sub.setMoney(sub.getMoney() - mo);

		System.out.println("출금이 완료되었습니다");
	}
}
