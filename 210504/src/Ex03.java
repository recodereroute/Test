import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("C:\\Java\\bufferwriter1.txt");
			bw = new BufferedWriter(fw);
			bw.write("버퍼 라이트 테스트 입니다. \n\n\n");
			
			/*
				\r\n으로 하는 이유는 Windows에서 파일의 개행을 \r\n으로 받아서 그럽니다. OS마다 달라요 ㅎ
				Java API를 보니 시스템 프로퍼티의 line.separator 로 정의되는 행 단락 문자는 플랫폼에 의존하기 위해(때문에),
				newLine() 메소드가 제공되고 있습니다. 
				모든 플랫폼이 개행 문자 ('\n')로 행을 끝 시키는 것은 아니기 때문에, 개행 문자를 직접 기입하는 것보다도,
				이 메소드를 호출해 행을 종료시키는 것을 추천합니다.
			*/
			
//			bw.newLine();
			bw.write("안녕하세요." + System.getProperty("line.separator"));
			bw.write("내용 끝 입니다.");
			bw.flush();
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fw != null) {
				try {
					fw.close();
				}catch(IOException e) {}
			}
			if(bw != null) {
				try {
					bw.close();
				}catch(IOException e) {}
			}
		}
	}

}
