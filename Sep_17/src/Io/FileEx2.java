package Io;

import java.io.File;

public class FileEx2 {

	public static void main(String[] args) {
		File file = new File("c:\\temp\\InputStreamEx1.java");
		
		//���� �̸�
		String fileName = file.getName();
		// . �� ��ġ�� �ľ� �Ź� �ٲ�� ���ϸ� ����
		int pos = fileName.lastIndexOf(".");
		
		System.out.println("���ϸ� : "+fileName);
		System.out.println("Ȯ���ڸ� ������ ���ϸ� : "+fileName.substring(0, pos));
		System.out.println("Ȯ���� : "+fileName.substring(pos+1));
		
		System.out.println("��θ� ������ ���ϸ� : "+file.getPath());
		System.out.println("������ ���� �ִ� ������ : "+file.getParent());
		
		System.out.println("File.separator : "+File.separator);
		System.out.println("File.pathSeparator : "+File.pathSeparator);
		

	}

}
