package package03;

import java.util.HashMap;
import java.util.Map;

public class Ex16Test {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("이숭무", 25);
		map.put("이상범", 30);
		map.put("이장범", 35);
		
		System.out.println("map의 크기 : " + map.size());
		System.out.println("데이터 출력 : " + map.get("이장범"));
		
		// map에 데이터 삭제
		map.remove("이장범");
		for(String str : map.keySet()) {
			System.out.println(map.get(str));
		}
		
		// map 에 있는 데이터 수정
		map.put("이숭무", 50); // map 은 중복키를 허용하지 않기때문에 가능하다.
		for(String str : map.keySet()) {
			System.out.println("변경 후 : " + map.get(str));
		}
		
		// 전체 삭제
		map.clear();
		System.out.println("map의 크기 : "+ map.size());
	}
}

// 데이터 저장 : put(키, 값) 중복 키를 허용하지 않는다.
// 데이터를 수정 : put(키, 값) 키는 존재하는 키 이어야 한다.
// 키만 가져올 때 : keySet()
// 값을 가져올 때 : get(key)
// 모든 데이터 삭제 : clear()
// 특정 값 삭제 : remove(key) , remove(key, val)
// 크기 : size()