package package02;

public class Account {
	int accNum;
	int balance;
	String accName;
	Account(int accNum, int balance, String accName){
		this.accName = accName;
		this.balance = balance;
		this.accNum = accNum;
	}
	// 출금
	public void setWithdraw(int money) {
		this.balance -= money;
	}
	
	// 입금
	public void setDeposit(int money) {
		this.balance += money;
	}
	
	public void print() {
//		System.out.println("계좌 번호\t계좌주\t입금액");
		System.out.println(this.accNum + "\t" + this.accName + "\t" + this.balance);
	}
}
