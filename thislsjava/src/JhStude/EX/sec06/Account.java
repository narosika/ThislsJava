package JhStude.EX.sec06;

public class Account {
	private String bankNum;
	private String accountMaster;
	private int bank;

	Account(){}		//기본생성자 생성
	
	//1.계좌생성 생성자
	Account (String bankNum, String accountMaster, int bank) {

		this.bankNum = bankNum;
		this.accountMaster = accountMaster;
		this.bank = bank;
	}
	
	public String getBankNum() {
		return bankNum;
	}
	public void setBankNum(String bankNum) {
		this.bankNum = bankNum;
	}
	public String getAccountMaster() {
		return accountMaster;
	}
	public void setAccountMaster(String accountMaster) {
		this.accountMaster = accountMaster;
	}
	public int getBank() {
		return bank;
	}
	public int getBank(int i ) {
		int plus = bank + i;
		return plus;
	}
	public void setBank(int bank) {
		this.bank = bank;
	}
	public void setBank(int bank, int i) {
		this.bank = bank - i;
	}
}
