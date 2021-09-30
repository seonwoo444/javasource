package learning;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderEx {

	/* BufferedRea... : readLine-�ٴ����� �о����
	 * 
	 */
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("c:\\temp\\file1.txt");
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter("c:\\temp\\tset5.txt");
				BufferedWriter bw = new BufferedWriter(fw)) {
			
			String line = "";

			while ((line = br.readLine())!=null) {
				bw.write(line);
				bw.newLine();//���� = \r\n
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
