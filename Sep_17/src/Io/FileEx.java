package Io;

import java.io.File;

/* File
 * 파일을 다루기 위한 클래스
 * 폴더(디렉토리) : /, \
 * \t, \n, \b... 이걸로 인식 되기 때문에
 * \\ 하나 더 붙여서 써준다
 */


public class FileEx {

	public static void main(String[] args) {
		//먼저 객체부터 생성해 준다
		File file1 = new File("c:\\temp\\test1.txt");
		File file2 = new File("c:\\temp\\test1.txt");

		File file3 = new File("c:\\temp");
		File file4 = new File(file3, "test1.txt");
		//File file4 = new File(new File("c:\\temp"), "test1.txt");
		
		
	}

}
