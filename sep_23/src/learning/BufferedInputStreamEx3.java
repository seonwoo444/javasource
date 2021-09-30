package learning;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx3 {

	public static void main(String[] args) {

		// FileInputStream�� ����ϴ� ��� + byte �迭 �߰�
		try (FileInputStream fis = new FileInputStream("c:\\temp\\picture.jpg")) {

			byte data[] = new byte[1024];

			long start = System.currentTimeMillis();
			while (fis.read(data) != -1) {}
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream�� ���� " + (end - start));
		} catch (Exception e) {
			e.printStackTrace();
	}

		try (FileInputStream fis = new FileInputStream("c:\\temp\\picture.jpg");
				BufferedInputStream bis = new BufferedInputStream(fis)) {

			byte data[] = new byte[1024];

			long start = System.currentTimeMillis();
			while (bis.read(data) != -1) {}
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream+BufferedInputStream ���� " + (end - start));

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
