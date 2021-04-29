package package2;

public class Ex03 {
	static int idx;
	String email;
	String name;
	public Ex03(String email, String name) {
		idx++;
		this.email = email;
		this.name = name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getIndex() {
		return this.idx;
	}
}
