package learning;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx {

	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("c:\\temp\\picture.jpg");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("c:\\temp\\picture_copy2.jpg");
			bos = new BufferedOutputStream(fos);
			
			int data;
			while ((data = bis.read())!=-1) {
				bos.flush();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bis.close();
				fis.close();
				fos.close();
				bos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
