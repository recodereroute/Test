package package02;

public class Ex07Test {

	public static void main(String[] args) {
		String str = "100";
		// 박싱(Boxing) - Wrapper 자료형에 박싱(포장)했다.
		Integer i = Integer.parseInt(str);
		Integer i1 = new Integer(str);
		Integer i2 = Integer.valueOf(str);
		System.out.println(i+" "+i1+ " "+i2);
		
		// 언박싱 - Wrapper 자료형에 있는 값을 기본 자료형에 담는다.
		int ii = i;
		int ii1 = i1.intValue();
		System.out.println(ii+" "+ii1);
		
		String str1 = "true";
		Boolean b = Boolean.parseBoolean(str1);
		if(b) {
			System.out.println("bool 타입으로 변환");
		}
		
		System.out.println(b);
	}

}
