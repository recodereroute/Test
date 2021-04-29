package package2;

import java.util.HashMap;

public class Ex08Test {

	public static void main(String[] args) {
		HashMap<Integer, Ex06> map = new HashMap<Integer, Ex06>();
		Ex06 ex = new Ex06("냉장고", 1000);
		map.put(Ex06.idx, ex);
		
		ex = new Ex06("에어컨", 500);
		map.put(Ex06.idx, ex);
		
		ex = new Ex06("세탁기", 700);
		map.put(Ex06.idx, ex);
		
		ex = new Ex06("김치냉장고", 1500);
		map.put(Ex06.idx, ex);
		
		ex = new Ex06("TV", 2000);
		map.put(Ex06.idx, ex);
	
		
		for(int key: map.keySet()) {
			System.out.println(map.get(key).getGoodsName() + " : " + map.get(key).getGoodsPrice());
			
		System.out.println("pull 연습중입니다.");
		}
	}

}
