package package02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ex09Test {

	public static void main(String[] args) {
//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 1; i <= 45; i++) {
			list.add(i); // 45개
		}
		int lotto[] = new int[6]; // 맵에서 6개의 값을 저장하기 위한 배열을 만듦
//		System.out.println(list.get(list.size()-1));
		for(int i = 0; i < lotto.length; i++) {
			int num = (int)(Math.random() * list.size()); 
			// random 이 0 ~ 1 사이 값이니 list.size(45)를 곱해주면 44까지 출력된다. - 즉 모든 인덱스가 들어감.

			lotto[i] = list.get(num); // 맵에 저장된 값 가져옴
			list.remove(num); // 중복된 값을 뽑으면 안되기 때문에 뽑힌값은 삭제
		
		}
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i]);
		}
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		// map 에서 remove 함수를 사용하면 key , value 가 같이 사라짐.
		int tmp[] = new int[1];
		map.put(1, 1);
		map.put(2, 2);
		tmp[0] = map.get(1);
		
		System.out.println(map.get(1));
		map.remove(1);
		
		tmp[0] = map.get(1);
		System.out.println(tmp[0]);
		
		
	}

}
