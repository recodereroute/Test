package package03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex11Test {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		String strNow = now.toString();
		System.out.println(strNow);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // yyyy-MM-dd
		String strNow2 = sdf.format(now);
		// 날짜를 문자열로 변환 sdf.format(날짜)
		System.out.println(strNow2);
		sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss am");
		strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		sdf = new SimpleDateFormat("y년 M월 d일 a h시 m분 s초"); // 한글자씩 입력해도 별 사오간 없는듯 a :오후
		strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}
}