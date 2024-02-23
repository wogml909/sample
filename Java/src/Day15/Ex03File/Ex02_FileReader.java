package Day15.Ex03File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.attribute.FileAttribute;
import java.io.FileReader;


public class Ex02_FileReader {

    public static void main(String[] args) {

        FileReader fr = null;

        try {
            fr = new FileReader("./src/Day15/Test.txt"); // 파일 경로 지정 (문자열로)

            int data = 0;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (FileNotFoundException e) {
            System.err.println("파일이 존재하지 않습니다.");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("파일을 읽는 중에 오류가 발생했습니다."); // 오류 메시지 수정
            e.printStackTrace();
            
        } finally {
            try {
                if (fr != null) {
                    fr.close(); // 파일을 열었으면 반드시 닫아야 함
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}