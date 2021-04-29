package package01;

import java.util.HashMap;
import java.util.Iterator;

public class Ex01 {

	public static void main(String[] args) {
		// 데이터를 저장하는 방식
		
		// 기본 자료형을 이용한 변수
		// 같은 자료형을 여러개 저장할 수 있는 배열
		// 다른 유형의 데이터를 저장 할 수 있는 클래스
		// 클래스 배열
		// 배열의 단점 : 크기가 지정되어 있다.
		int i[] = new int[3];
		i[0] = 0; i[1] = 1; i[2] = 3;
		
		// 크기가 정해져 있지 않은 - 크기가 변경 가능한 ,  (배열과 비슷한)저장공간을 만들고 싶다.
		// HashMap<Key, Value>
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "이숭무");// 파이썬 - 딕셔너리 비슷한 느낌인듯
		map.put(2, "이상범");
		map.put(3, "이장범");
		map.put(4, "박준현");
		map.put(4, "김이박"); // 마지막 값을 같게됨.
		map.put(7, "김찬중");
		// 키가 중복되지 않는다.
		// 키가 중복되면 마지막 값이 저장된다.
		

		System.out.println(map.get(1));
		System.out.println(map.size());
		System.out.println(map.get(3));
		System.out.println(map.get(4));
		
		Iterator<Integer> keys = map.keySet().iterator(); // map의 키값만 가져오겠다. (반복문 사용하려면 iterator 형태로 저장)
		
		// 키가 있을때까지만 반복
		while(keys.hasNext()) {
			Integer key = keys.next();
			System.out.println(map.get(key));
		}
	}
}