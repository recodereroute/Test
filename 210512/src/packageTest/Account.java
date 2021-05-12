package packageTest;

public class Account {
	int accNum;
	int balance;
	String name;
	public Account(int accNum, int balance, String name) {
		this.accNum = accNum;
		this.balance = balance;
		this.name = name;
	}
	
	public void setDeposit(int money) {
		this.balance += money;
	}
	
	public void setWithdraw(int money) {
		this.balance -= money;
	}
	
	public void print() {
		System.out.println(this.accNum + "\t" + this.name + "\t" + this.balance);
	}
	
	
}
