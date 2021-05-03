package package02;

public class Ex05Test {

	public static void main(String[] args) {
		String f = "12.4";
		Float f1 = Float.parseFloat(f);
		System.out.println(f + 20.5f);
		Float f2 = new Float(f);
		System.out.println(f2 + 20.5f);
		
		System.out.println("byte : " + f1.byteValue());
		System.out.println("long : "+ f1.longValue());
		System.out.println("short : " + f1.shortValue());
		System.out.println("int : " + f1.intValue());
		
		System.out.println("MAX 값 : " + Float.MAX_VALUE);
		System.out.println("MIN 값 : " + Float.MIN_VALUE);
		
	}

}
