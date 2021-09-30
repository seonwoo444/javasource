package Io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx3 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("c:\\temp\\pictur.jpg");
			fos = new FileOutputStream("c:\\temp\\pictur_copy.jpg");
			byte[] datas = new byte[100];

			while (fis.read(datas) != -1) {
				fos.write(datas);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}
}
