package package04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex20Test {

	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<String, Student>(); // 아이디
		
		Student std = new Student("123456", "이숭무"); // 비밀번호
		map.put("high1", std);
		std = new Student("234567", "이상범");
		map.put("high2", std);
		std = new Student("121212", "이장범");
		map.put("high3", std);
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("ID : ");
			String id = sc.nextLine();
			System.out.print("PW : ");
			String pw = sc.nextLine();
		
			// map에 키가 존재하는지
			if(map.containsKey(id)) {
				Student std1 = map.get(id);
				if(std1.sno.equals(pw)) {
					System.out.println("정상적으로 로그인 되었습니다.");
					break;
				}else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			}else {
				System.out.println("존재하지 않는 ID 입니다.");
			}
		}
	}
}