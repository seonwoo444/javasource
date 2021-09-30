package learning;

import java.io.FileReader;
import java.io.Reader;

/* ó���� ������ ���ڶ�� Reader, Writer�� ����
 * 
 * 
 */



public class FileReaderEx {

	public static void main(String[] args) {
		try(Reader reader = new FileReader("c:\\temp\\file1.txt")) {
			
			char[] cduf = new char[100];
			
			int readcharNo;
			
			while ((readcharNo = reader.read(cduf)) != -1) {
				System.out.println(cduf);  
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
