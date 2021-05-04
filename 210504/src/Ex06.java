import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) {
		FileReader fr = null; // 바로 생성자를 안 만들고 null로 주는 이유는 읽어오는 구문을 try 안에 넣어줘야 하기때문
							// try 블럭 안에 넣어주면 블럭 밖에서 사용하지 못하기 때문에 선언은 밖에서 해줘야 함.
		BufferedReader br =null;
		
		try {
			fr = new FileReader("C:\\Java\\fileWriter.txt");
			br = new BufferedReader(fr);
			String msg;
			while((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr != null) fr.close();
				if(br != null) br.close();
			}catch(IOException e) {}
			
			
		}
	}

}
