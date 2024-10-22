package JhStude.EX.sec06.October22;

public class Account {
	private String accNum;
	private String name;
	private int money;
	
	public Account (String accNum, String name, int money) {
		this.accNum = accNum;
		this.name = name;
		this.money = money;
	}

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
		this.money = money;
	}
	

}
