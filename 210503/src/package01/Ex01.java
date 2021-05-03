package package01;


public class Ex01 {
	public void gugu(int startDan, int endDan, int startGop, int endGop) {
		for(int dan = startDan; dan <= endDan; dan++)
			for(int gop = startGop; gop <= endGop; gop++) {
				System.out.println(dan + " * " + gop + " = " + gop * dan);
			}
	}
}
