package package01;

import java.util.HashMap;

public class Ex02 {

	public static void main(String[] args) {
		int i[] = new int[3];
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;

		// 배열은 크기를 확장할 수 없다.
		// HashMap<key, value>
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("high0", "이숭무");
		map.put("high1", "이상범");
		map.put("high2", "김이박");
		map.put("high3", "김찬중");

		System.out.println(map.get("high0"));
		
		System.out.println(map.keySet()); // 키만 가져온다.
		System.out.println(map.values()); // value 만 가져온다.
		
		for(String key : map.keySet()) {
			System.out.println(map.get(key));
		}
	}
}