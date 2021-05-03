package package03;

import java.util.ArrayList;
import java.util.List;

public class Ex12Test {

	public static void main(String[] args) {
		// 변수 : 자료를 하나만 저장
		// 배열 : 같은 자료형의 데이터를 지정된 크기 만큼 저장
		// class : 여러 유형의 데이터를 저장할 수 있게 만듦.
		// 컬렉션 : 크기가 지정되지 않은 자료형 (List, Map, set, ......)
		//		   크기를 유동적으로 사용할 수 있게 만들어 놓음
		// List vs Map : key 를 사용 하냐 index 를 사용하냐의 차이
		List<String> list = new ArrayList<String>();
		list.add("이상범");
		list.add("이장범");
		list.add("이상무");
		list.add("이충무");
		list.add("이장범");
		for(String s  : list) {
			System.out.println(s);
		}
		System.out.println(list.size());
		
		String str = list.get(2);
		System.out.println("2번 index : " + str);
		
		System.out.println(list.get(3));
		System.out.println(list.size());
		list.remove(3); // 인덱스를 이용한 remove
		System.out.println(list.get(3));
		System.out.println(list.size());
		
		list.add(2, "DataBase");
		System.out.println(list.size());
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		list.remove("DataBase"); // value를 이용해서 삭제
		System.out.println(list.size());
		System.out.println(list.get(2));
	
	}
}