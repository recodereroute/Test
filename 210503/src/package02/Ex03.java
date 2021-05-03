package package02;

public class Ex03 {

	public static void main(String[] args) {
		// byte, char, short, int, long, float, double, boolean
		// 정수를 문자열로 - 변환 x , 실수나 bool 타입도 문자열로 x
		// 문자열을 기본 자료형으로 변환 x
		// Wrapper 자료형
		// 기본 자료형을 문자열로 변환 가능하게 하고 , 문자열도 기본 자료형으로 변환 가능하게 해주는 클래스
		// Wrapper - 대문자로 시작
		int i = 10;
		Integer i1 = 10;
		short s = 10;
		Short s1 = 10;
		byte b = 12;
		Byte b1 = 12;
		long l = 10L;
		Long l1 = 10L;
		float f = 10.5f;
		Float f1 = 10.5f;
		double d = 10.5;
		Double d1 = 10.5;
		boolean bl = true;
		Boolean bl1 = true;
		
		Integer i2 = 100; // 박싱
		int i3 = i2; // 언박싱
		
//		i3 = null; - 에러 발생 
		i2 = null;
		// Wrapper 자료형은 null 값을 저장하기 위해서 사용 
		// 문자열을 기본 자료형으로 변환하기 위해서 사용

	}

}