package package3;

import java.util.HashMap;

public class Ex09Test {

	public static void main(String[] args) {
		HashMap<String, Ex09> map = new HashMap<String, Ex09>();
		Ex09 ex = new Ex09("ID_1", "Email_1", "name_1");
		map.put(ex.getId(), ex);
		
		ex = new Ex09("ID_2", "Email_2", "name_2");
		map.put(ex.getId(), ex);
		
		ex = new Ex09("ID_3", "Email_3", "name_3");
		map.put(ex.getId(), ex);
		
		ex = new Ex09("ID_4", "Email_4", "name_4");
		map.put(ex.getId(), ex);
		// 해쉬맵은 저장이 순서대로 되진 않는다.
		
		for(String key : map.keySet()) {
			System.out.println(map.get(key).getEmail() + " : "+ map.get(key).getName());
		}
		
		System.out.println("push 연습중입니다.");
		

	}

}
