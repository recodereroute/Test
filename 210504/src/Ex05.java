import java.io.FileReader;
import java.io.IOException;

public class Ex05 {

	public static void main(String[] args) {
		// 문자단위로 읽어 옴
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\Java\\fileWriter.txt");
			int readChar;
			
			while((readChar = fr.read()) != -1) {
				System.out.println((char)readChar);
			}
				
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr != null) fr.close();
			}catch(IOException e) {}
		}
	}

}
