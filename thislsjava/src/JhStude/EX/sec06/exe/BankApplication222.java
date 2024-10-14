package JhStude.EX.sec06.exe;

import java.util.Scanner;

public class BankApplication222 {
	static Account222[] bankAccount = new Account222[100];	//클래스배열을 외부에선언
	static Scanner sc = new Scanner(System.in);			//스캐너를 정적멤버로 선언
	
	public static void main(String[] args) {
		boolean run = true;

		while(run)	{
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택:> ");
			int selectNum = sc.nextInt();
			
			if(selectNum == 1)	{
				newAccount();	//계좌생성 메소드 실행
				}
			if(selectNum == 2)	{
				chackAcc();		//계좌확인 메소드 실행
			}
			if(selectNum == 3)	{
				saving();		//예금 메소드 실행
			}
			if(selectNum == 4)	{
				minus();		//출금 메소드 실행
			}
			if(selectNum==5)	{
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	//메인메소드 종료
	//계좌생성 정적 메소드 생성
	static void newAccount(){
	System.out.println("-----------------");
	System.out.println("계좌생성");
	System.out.println("-----------------");
	//계좌생성 시작
	System.out.println("계좌번호: ");
	String aa=sc.nextLine();
	String accNum = sc.nextLine();
	System.out.println("계좌주: ");
	String name = sc.nextLine();
	System.out.println("초기 입금액: ");
	int money = sc.nextInt();
	//스캐너로 입력받은 값들을 acc객체 에 저장
	Account222 acc = new Account222(accNum, name, money);
	//클래스배열에 빈곳이 있다면 acc객체 를 추가하기
	for (int i=0 ; i<bankAccount.length ; i++) {
		if(bankAccount[i]==null) {
			bankAccount[i] = acc;
			break;
		}
	}
	System.out.println("계좌가 생성되었습니다.");
	}	
	//계좌생성 메소드 끝
	//계좌확인 메소드
	static void chackAcc() {
	System.out.println("-----------------");
	System.out.println("계좌목록");
	System.out.println("-----------------");
	//계좌 클래스배열에 널값이 아니면 빈곳이 아니므로 작은수부터 하나씩 계좌 출력
	for(int i =0 ; i<bankAccount.length ; i++){
		if(bankAccount[i] != null){
			//객체를 끄짐어 내기위해 변수를 만들어서 저장
			Account222 BN = bankAccount[i];
			System.out.println(BN.getBankNum() + "\t" + BN.getAccountMaster() + "\t" + BN.getBank());
			}
		}
	}
	//계좌입금 메소드
	static void saving() {
		int plusc;
		System.out.println("-----------------");
		System.out.println("예금");
		System.out.println("-----------------");
		//계좌번호 입력받기
		System.out.println("계좌번호: ");
		String s = sc.nextLine();
		String accNum = sc.nextLine();
		//입금액 입력받기
		System.out.println("입금액: ");
		int plusA=sc.nextInt();
		//계좌찾기 메소드실행
		Account222 accB = comAcc(accNum);		//<<----------얘가 가지고 있는값은 계좌번호
		if (accB == null) {
			System.out.println("계좌가 없습니다.");
			return;
		}
		plusc = accB.getBank() + plusA;
		accB.setBank(plusc);
	}
	//계좌출금 메소드
	static void minus() {
		int minus;
		System.out.println("-----------------");
		System.out.println("예금");
		System.out.println("-----------------");
		//계좌번호 입력받기
		System.out.println("계좌번호: ");
		String n = sc.nextLine();
		String accNum = sc.nextLine();
		//출금액 입력받기
		System.out.println("출금액: ");
		int minusA=sc.nextInt();
		
		//계좌찾기 메소드실행
		Account222 accB = comAcc(accNum);		//<<----------얘가 가지고 있는값은 계좌번호
		if (accB == null) {
			System.out.println("계좌가 없습니다.");
			return;
		}
		if(minusA > accB.getBank()) {
			System.out.println("계좌에 잔액이 부족합니다");
			return;
		}
		minus = accB.getBank() - minusA;
		accB.setBank(minus);
		System.out.println("출금이 완료되었습니다");
	}
	//계좌찾기 메소드
	static Account222 comAcc (String accNum) {
		Account222 accNo = null;
		//계좌번호 에서 입력받은값을 배열에있는 값이랑 비교
		for(int i=0 ; i<bankAccount.length ; i++) {
			//배열0번지 부터 값이있는 주소 찾기
			if(bankAccount[i] != null){
				//accNum 가 가지고 있는값이 계좌번호와 맞는지 비교
				String dbano = bankAccount[i].getBankNum();
				if(dbano.equals(accNum)) {
					accNo = bankAccount[i];
				}
			}
		}
		return accNo;
	}
}
		
