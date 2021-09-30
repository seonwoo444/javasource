package learning;

import java.io.File;
import java.io.FileWriter;

public class FileWriterEx {

	public static void main(String[] args) {
		
		try(FileWriter writer = new FileWriter(new File("c:\\temp\\test2.txt"), true)) {
			
			writer.write("FileWriter�� ���ڿ��� �ٷ�\r\n");
			writer.write("����� �� �ִ�\r\n");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
