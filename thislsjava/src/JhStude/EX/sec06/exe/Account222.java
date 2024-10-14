package JhStude.EX.sec06.exe;

public class Account222 {
	private String bankNum;
	private String accountMaster;
	private int bank;
	
	//1.계좌생성 생성자
	Account222 (String bankNum, String accountMaster, int bank) {
		this.bankNum = bankNum;
		this.accountMaster = accountMaster;
		this.bank = bank;
	}
	//------여기부터 겟터와 셋터
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
	public void setBank(int bank) {
		this.bank = bank;
	}
}
