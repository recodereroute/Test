package package02;

import java.util.Random;
import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int com1 = (int)(Math.random() * 3) + 1;// 0, 1, 2
		
		Random rnd = new Random(10);
		int com1 = rnd.nextInt(3) + 1; // 이렇게 표현도 가능하다.
		
		
		System.out.println("가위 바위 보");
		System.out.println("가위 : 1, 바위 : 2, 보 : 3");
		int saram = sc.nextInt();
		switch(com1) {
		case 1 :
			if(saram == 1) {
				System.out.println("비겼습니다.");
			}else if(saram == 2) {
				System.out.println("이겼습니다! 축하합니다.");
			}else if(saram == 3) {
				System.out.println("패배하였습니다...");
			}
			break;
		case 2 : 
			if(saram == 1) {
				System.out.println("패배하였습니다...");
			}else if(saram == 2) {
				System.out.println("비겼습니다.");
			}else if(saram == 3) {
				System.out.println("이겼습니다! 축하합니다.");
			}
			break;
		case 3 : 
			if(saram == 1) {
				System.out.println("이겼습니다! 축하합니다.");
			}else if(saram == 2) {
				System.out.println("패배하였습니다...");
			}else if(saram == 3) {
				System.out.println("비겼습니다.");
			}
			break;
		}
	}
}
