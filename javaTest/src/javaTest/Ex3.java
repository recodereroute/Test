package javaTest;

public class Ex3 {
	
	public static void main(String[] args) {
		// 정수형 변수
		byte b; // -128 ~ 127 / 1B = 8bit
		b = 127;
		System.out.println(b);
		char c;//0~65535 , unicode - 2B
		c = 65535;
		short s; // 2B
		s = 0;
		System.out.println(s);
		int i;// 4B
		i = 54;
		System.out.println(i);
		long l;// 8B
		l = 100000000l;
		System.out.println(l);
		c = 65; // 65 : A ~ , 97 : a ~
		System.out.println(c);
		c = 'D'; // char 만이 문자와 숫자를 저장할 수 있다.
		System.out.println(c);
		int ii = c;
		System.out.println(ii);
	}

}
