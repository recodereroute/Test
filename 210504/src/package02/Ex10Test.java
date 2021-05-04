package package02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex10Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Map<Integer, Account> map = new HashMap<Integer, Account>();
		
		int accNum;
		int money;
		String name;
		Account acc = null;
		
		while(true) {
			System.out.println("계좌등록 : 1 | 입금 : 2 | 출금 : 3 | 계좌 정보 : 4 | 종료 : 5");
			System.out.print("해당번호를 입력하세요 : ");
			int num;
			try {
				num = sc.nextInt();
			}catch(Exception e) {
				sc.nextLine();
				System.out.println("올바른 숫자만 입력해 주세요.");
				continue;
			}
			switch(num) {
			case 1:
				System.out.println("계좌등록 화면입니다.\n");
				System.out.print("계좌번호를 입력해 주세요 : ");
				
				try {
					accNum = sc.nextInt();
					System.out.print("입금 금액을 입력하세요 : ");
					money = sc.nextInt(); sc.nextLine();
				}catch(Exception e) {
					sc.nextLine();
					System.out.println("숫자만 입력하세요.");
					break;
				}
				System.out.print("계좌 주를 입력하세요 : ");
				name = sc.nextLine();
				
				acc = new Account(accNum, money, name);
				map.put(accNum, acc);
				break;
			case 2:
				System.out.println("입금 화면입니다.\n");
				System.out.print("입금 계좌를 입력해 주세요 : ");
				
				accNum = sc.nextInt(); sc.nextLine(); // nextLine 해주는 이유 : 개행문자가 남아 있을수 있어서 라는데 정확히 모르겠다.
				if(map.containsKey(accNum)) {
					System.out.print("입금액을 입력해 주세요 : ");
					money = sc.nextInt(); sc.nextLine();
					acc = map.get(accNum);
					acc.setDeposit(money);
				}else {
					System.out.println("계좌가 존재하지 않습니다.");
				}
				
				break;
			case 3:
				System.out.println("출금 화면입니다.\n");
				System.out.print("출금 계좌를 입력해 주세요 : ");
				
				accNum = sc.nextInt(); sc.nextLine();
				if(map.containsKey(accNum)) {
					System.out.print("출금액을 입력해 주세요 : ");
					money = sc.nextInt(); sc.nextLine();
					acc = map.get(accNum);
					acc.setWithdraw(money);
				}else {
					System.out.println("계좌가 존재하지 않습니다.");
				}
				break;
			case 4:
				System.out.println("계좌 정보 화면입니다.\n");
				System.out.println("계좌 번호\t계좌주\t입금액");
				for(Integer key : map.keySet()) {
					Account acc1 = map.get(key);
					acc1.print();
				}
				break;
			case 5:
				System.out.println("프로그램이 종료됩니다.\n");
				System.exit(0);		
			}
		}
	
		
	}
}