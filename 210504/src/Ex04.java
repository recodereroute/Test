import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex04 {

	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter("C:\\Java\\printwriter.txt");
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw, true);
			pw.println("안녕하세요. ");
			pw.println("반갑습니다. ");
			pw.println(100);
			pw.println(10.5);
			pw.println(new Integer(1000));
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fw != null) fw.close();
				if(bw != null) bw.close();
				if(pw != null) pw.close();
			}catch(IOException e) {}
		}
	}

}
