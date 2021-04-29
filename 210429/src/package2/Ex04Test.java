package package2;

import java.util.HashMap;

public class Ex04Test {

	public static void main(String[] args) {
		HashMap<Integer, Ex03> map = new HashMap<Integer, Ex03>();
		
		Ex03 ex = new Ex03("high0", "이숭무");
		map.put(ex.idx, ex);
		
		ex = new Ex03("high1", "이상범");
		map.put(ex.idx, ex);
		
		ex = new Ex03("high2", "김이박");
		map.put(ex.getIndex(), ex);
		
		ex = new Ex03("high3", "김찬중");
		map.put(ex.idx, ex);
		
		System.out.println(map.get(1).getName());
		
		
		for(int key : map.keySet()) {
			System.out.println(map.get(key).getName());
		}
	}

}
