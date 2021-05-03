package package01;

import java.util.Scanner;

public class Ex02Test {

	public static void main(String[] args) {
		Ex01 ex = new Ex01();
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 단을 입력해주세요 : ");
		int sDan = sc.nextInt();
		System.out.print("끝 단을 입력해주세요 : ");
		int eDan = sc.nextInt();
		System.out.print("시작 곱을 입력해주세요 : ");
		int sGop = sc.nextInt();
		System.out.print("끝 곱을 입력해주세요 : ");
		int eGop = sc.nextInt();
		ex.gugu(sDan, eDan, sGop, eGop);
		
	}

}
