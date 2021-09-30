package Io;

import java.io.IOException;
import java.io.InputStream;

public class InputStringEx2 {

	public static void main(String[] args) {
		InputStream in = System.in;
		InputStream out = System.in;
		
		byte b[] = new byte[100];
		
		try {
			//입력 스트립에서 지정된 byte 수 만큼 읽어오기
			while (in.read(b)!=-1) {
				out.write(b);						
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
			in.close();
			out.close();
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

	}
}
