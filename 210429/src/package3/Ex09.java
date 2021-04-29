package package3;

public class Ex09 {
	String userId;
	String userEmail;
	String userName;
	
	public Ex09(String Id, String Email, String name) {
		this.userId = Id;
		this.userEmail = Email;
		this.userName = name;
	}
	
	public String getId() {
		return this.userId;
	}
	public String getEmail() {
		return this.userEmail;
	}
	public String getName() {
		return this.userName;
	}
	
}

// 임의의 사용자를 4명 넣고 , key : userId - 4명의 임의의 사용자를 출력