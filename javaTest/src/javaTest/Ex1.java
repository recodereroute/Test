package javaTest;

public class Ex1 {

	public static void main(String[] args) {
		int a;
		int b;
		// 같은 이름으로 선언을 여러번 할 수 없다.
		a = 10;
		b = 20;
		System.out.println(a);
		a = 100; // 변수는 오로지 하나의 값만 저장한다.
		System.out.println(a);
		int c = 10;
		System.out.println(c);
	}

}
