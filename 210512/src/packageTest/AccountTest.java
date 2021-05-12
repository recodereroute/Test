package packageTest;

import java.util.HashMap;
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Account> map = new HashMap<Integer, Account>();
		int num;
		int money;
		int accNum;
		int balance;
		String name;
		Account acc = null;
		
		while(true) {
			System.out.println("계좌입력 : 1 | 입금 : 2 | 출금 : 3 | 계좌 조회 : 4 | 종료 : 5");
			num = sc.nextInt(); sc.nextLine();
			
			switch(num) {
			case 1:
				System.out.println("계좌 입력 페이지 입니다.");
				System.out.print("계좌번호를 입력해 주세요 : ");
				accNum = sc.nextInt(); sc.nextLine();
				System.out.print("초기 금액을 입력해 주세요 : ");
				balance = sc.nextInt(); sc.nextLine();
				System.out.print("이름을 입력해 주세요 : ");
				name = sc.nextLine();
				acc = new Account(accNum, balance, name);
				map.put(accNum, acc);
				break;
			case 2:
				System.out.println("입금 페이지 입니다.");
				System.out.print("계좌 번호를 입력해 주세요 : ");
				accNum = sc.nextInt(); sc.nextLine();
				acc = map.get(accNum);
				
				System.out.print("입금액을 입력해 주세요 : ");
				money = sc.nextInt(); sc.nextLine();
				acc.setDeposit(money);
				break;
			case 3:
				System.out.println("출금 페이지 입니다.");
				System.out.print("계좌 번호를 입력해 주세요 : ");
				accNum = sc.nextInt(); sc.nextLine();
				acc = map.get(accNum);
				
				System.out.print("입금액을 입력해 주세요 : ");
				money = sc.nextInt(); sc.nextLine();
				acc.setWithdraw(money);
				break;
			case 4:
				System.out.println("계좌 조회 페이지 입니다.");
				for(Integer key : map.keySet()) {
					acc = map.get(key);
					acc.print();
				}
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		
		}
	}

}
