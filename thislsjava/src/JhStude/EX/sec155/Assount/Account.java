package JhStude.EX.sec155.Assount;

public class Account {
	private String accNum;
	private String name;
	private int money;
	
	static final int MAXADD = 30000000;
	static final int MAXSUB = -30000000;
	static final int LIMITMO = 0;
	
	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money=money;
	}
	
	Account(String accNum, String name, int money){
		this.accNum=accNum;
		this.name=name;
		this.money=money;
	}
	
}
