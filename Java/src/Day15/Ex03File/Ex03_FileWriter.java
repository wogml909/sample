package Day15.Ex03File;

import java.io.FileWriter;
import java.io.IOException;

public class Ex03_FileWriter {

	public static void main(String[] args) {
		FileWriter fw = null;
		String str = "텍스트 파일에 출력하라 내용";
		try {
			fw = new FileWriter("./src/Day15/Test2.txt");
			fw.write(str, 0, str.length());
			fw.close();
			System.out.println("텍스트 파일이 저장되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
