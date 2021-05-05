import java.io.FileWriter;
import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		FileWriter fw = null; // 파일에 글을 저장할수 있게 만들어준 자료형
		try {
			fw = new FileWriter("C:\\Java\\fileWriter.txt"); // '\' : escape 문자로 사용되기 때문에 '\\' 두번 써준다.
			String msg = "안녕하세요. FileWriter 테스트 입니다.";
			fw.write(msg);
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("파일이 존재하지 않습니다.");
		}finally {
			if(fw != null) {
				try {
					fw.close();
				}catch(IOException e){}
			}
		}
	
	}

}
