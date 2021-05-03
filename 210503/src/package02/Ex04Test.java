package package02;

public class Ex04Test {

	public static void main(String[] args) {
		String s1 = "123";
		Integer i1 = Integer.parseInt(s1);
		Integer i2 = new Integer(s1);
		System.out.println(i1);
		System.out.println(i2);
		
		String s2 = "10.5";
//		Integer i3 = Integer.parseInt(s2); - 실수는 정수로 변환하지 못한다.
//		System.out.println(i3);
		Double d1 = Double.parseDouble(s2);
		System.out.println(d1);
		
		int i4 = 123;
		if(i4 == i1) { // 일반 자료형과 Wrapper 자료형을 비교.
			System.out.println("두 값은 같습니다.");
		}else {
			System.out.println("두 값은 다릅니다.");
		}
		if(i1.equals(i4)) { // Wrapper 자료형은 .equals() 함수 사용가능 .
			System.out.println("같다.");
		}
		
		System.out.println("MAX 값 : " + Integer.MAX_VALUE);
		System.out.println("MIN 값 : " + Integer.MIN_VALUE);
	}

}
