package learning;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

// 문자 변환 보조 스트림
//  : 바이트 기반 스트림 => Reader or Writer 로 변환해서 사용
// 인코딩 방식 지정(utf - 8, euc - kr, ms949, ascii....)
// InputStream, OutputStream => 모든 파일 처리
// File..., FileOut...
// BufferedIn..., BufferedOut...

// Reader, writer => 문자로된 파일 처리
// FileReader, FileWriter
// BufferedRea..., BufferedWri...

public class InputStreamReaderEx {

	public static void main(String[] args) {
		
		try(InputStreamReader reader = new InputStreamReader
				(new FileInputStream("c:\\temp\\file1.txt"),"ms949");
				FileWriter writer = new FileWriter("c:\\temp\\test3.txt")) {
			char cbuf[] = new char[100];
			
			while (reader.read(cbuf)!=-1) {
				writer.write(cbuf);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
