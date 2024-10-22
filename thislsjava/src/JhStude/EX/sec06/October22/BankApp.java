package JhStude.EX.sec06.October22;

import java.util.Scanner;

public class BankApp {
	static Scanner sc = new Scanner(System.in);
	static Account[] accArray = new Account[100];
	
	public static void main(String[] args) {
	boolean run = true;
		
	while(run) {
		System.out.println("--------------------------------------------");
		System.out.println("1. 계좌생성 | 2.계좌확인 | 3.예금 | 4.출금 | 5.종료");
		System.out.println("--------------------------------------------");
		System.out.print("선택:> ");
		int select = (Integer.parseInt(sc.nextLine()));
		
		if(select == 1) {
			newAcc();
		}else if (select==2){
			checkAcc();
		} else if (select==3) {
			addAcc();
		} else if(select==4) {
			
		} else if(select==5) {
			break;
		}
		
		
	}
	}
	//계좌생성 메소드
	public static void newAcc() {
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		
		System.out.print("계좌번호: ");
		String accNum = sc.nextLine();
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("초기 입금액: ");
		int newMoney = (Integer.parseInt(sc.nextLine()));
		
		Account acc = new Account(accNum, name, newMoney);
		for(int i=0 ; i<accArray.length ; i++) {
			if(accArray[i] == null) {
				accArray[i]=acc;
				break;
			}
		}
	}
	//계좌확인
	public static void checkAcc() {
		System.out.println("--------");
		System.out.println("계좌확인");
		System.out.println("--------");
		for(int i=0 ; i<accArray.length ; i++) {
			if(accArray[i] != null) {
				Account b = accArray[i];
				System.out.print(b.getAccNum());
				System.out.print("    ");
				System.out.print(b.getName());
				System.out.print("    ");
				System.out.print(b.getMoney());
				System.out.println();
			}
		}
	}
	//계좌번호확인
	public static Account corssAcc(String chAcc) {
		Account scAcc = null;
		for(int i=0 ; i<accArray.length ; i++) {
			if(accArray[i] != null) {
				Account b = accArray[i];
				if(b.getAccNum().equals(chAcc)) {
					scAcc = b;
				}
			}
		}
		return scAcc;
	}
	
	//계좌입금
	public static void addAcc() {
		System.out.println("--------");
		System.out.println("예금하기");
		System.out.println("--------");
		
		System.out.println("계좌번호: ");
		String chAcc = sc.nextLine();
		System.out.println("예금액: ");
		int addMoney = (Integer.parseInt(sc.nextLine()));
		
		Account plusAcc = corssAcc(chAcc);
		
		if(plusAcc == null) {
			System.out.println("계좌번호가 틀렸습니다");
			return;
		} 
		
		plusAcc.setMoney(addMoney + plusAcc.getMoney());
		
		System.out.println("예금에 성공했습니다");
		System.out.println("계좌잔고: " + plusAcc.getMoney());
	}
	
	
}
