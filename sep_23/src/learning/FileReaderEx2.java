package learning;

import java.io.FileReader;
import java.io.Reader;

/* 처리할 파일이 문자라면 Reader, Writer가 편함
 * 
 * 
 */



public class FileReaderEx2 {

	public static void main(String[] args) {
		try(Reader reader = new FileReader("c:\\temp\\file1.txt")) {
			
			char[] cduf = new char[100];
			
			int readcharNo;
			
			while ((readcharNo = reader.read(cduf)) != -1) {
				String data = new String(cduf, 0, readcharNo);
				System.out.println(cduf);  
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
