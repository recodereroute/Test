package package01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<String, Student>();
		Student std = new Student("123456", "이숭무");
		map.put("high1", std);
		std = new Student("987456", "이상무");
		map.put("high2", std);
		std = new Student("987654", "이장무");
		map.put("high3", std);
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("아이디를 입력해 주세요 : ");
			String userId = sc.nextLine();	
			System.out.print("비밀번호를 입력해 주세요 : ");
			String userPw = sc.nextLine();	
			
			if(map.containsKey(userId)) {
				Student std1 = map.get(userId);
				if(std1.userPw.equals(userPw)) {
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
