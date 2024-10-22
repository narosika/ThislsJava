package JhStude.EX.sec06.october10;

import java.util.Scanner;

public class BankApplication {
	
	public static void main(String[] args) {

		Account[] bankAccount = new Account[100];
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int x=0;

		while(run)		{
			Account account = new Account();
			
			System.out.println("--------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택:> ");
			int selectNum = sc.nextInt();
			
			if(selectNum == 1)			{
				System.out.println("-----------------");
				System.out.println("계좌생성");
				System.out.println("-----------------");
				//계좌생성 시작
				System.out.println("계좌번호: ");
				String aa=sc.nextLine();
				account.setBankNum(sc.nextLine());
				System.out.println("계좌주: ");
				account.setAccountMaster(sc.nextLine());
				System.out.println("초기 입금액: ");
				account.setBank(sc.nextInt());
				//입력받은 정보를 객체에 담기
				Account acc = new Account(account.getBankNum(), account.getAccountMaster(), account.getBank());
				//System.out.println(acc.getBankNum());
				
				bankAccount[x] = acc;
				//System.out.println(bankAccount[x]);
				x +=1;
				System.out.println("계좌가 생성되었습니다.");
				}
		
			if(selectNum == 2)	{
				System.out.println("-----------------");
				System.out.println("계좌목록");
				System.out.println("-----------------");
				
				for(int i =0 ; i<bankAccount.length ; i++){
					if(bankAccount[i] != null){
						Account BN = bankAccount[i];
						System.out.println(BN.getBankNum() + "\t" + BN.getAccountMaster() + "\t" + BN.getBank());
					}
				}
			}
			
			if(selectNum == 3)	{
				int plusc;
				System.out.println("-----------------");
				System.out.println("예금");
				System.out.println("-----------------");
				//계좌번호 입력받기
				System.out.println("계좌번호: ");
				String s = sc.nextLine();
				String saving = sc.nextLine();
				//입금액 입력받기
				System.out.println("입금액: ");
				int plusA=sc.nextInt();
				
				//계좌번호 에서 입력받은값을 배열에있는 값이랑 비교
				for(int i =0 ; i<bankAccount.length ; i++)	{
					//배열0번지 부터 값이있는 주소 찾기
					if(bankAccount[i] != null){
						//배열 어딘가에 값이 있으면 그 값을 Bplus 에 대입
						Account Check = bankAccount[i];
						//Bplus가 가지고 있는값이 계좌번호와 맞는지 비교
						if(Check.getBankNum().equals(saving)){
								plusc= Check.getBank(plusA);
								Check.setBank(plusc);
						} else {
							System.out.println("입력하신 계좌는 없는 계좌입니다.");
						}
					}
				}
			}
			
			if(selectNum == 4)	{
				int minus;
				System.out.println("-----------------");
				System.out.println("예금");
				System.out.println("-----------------");
				//계좌번호 입력받기
				System.out.println("계좌번호: ");
				String n = sc.nextLine();
				String darw = sc.nextLine();
				//입금액 입력받기
				System.out.println("출금액: ");
				int minusA=sc.nextInt();
				
				//계좌번호 에서 입력받은값을 배열에있는 값이랑 비교
				for(int i =0 ; i<bankAccount.length ; i++)	{
					//배열0번지 부터 값이있는 주소 찾기
					if(bankAccount[i] != null){
						//배열 어딘가에 값이 있으면 그 값을 Bplus 에 대입
						Account Check = bankAccount[i];
						//Check가 가지고 있는값이 계좌번호와 맞는지 비교
						if(Check.getBankNum().equals(darw))	{
							if(Check.getBank()<minusA) {
								System.out.println("출금 신청금액이 너무 많습니다");
							} else {
							Check.setBank(Check.getBank(), minusA);
							System.out.println("출금에 성공했습니다");
							}
						}
					}
				}
				
			}
			
			if(selectNum==5)
			{
				run = false;
			}
		}
		System.out.println("프로그램 종료");

	}
			
}
		
