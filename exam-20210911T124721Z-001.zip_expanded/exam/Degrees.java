package exam;

import java.util.Scanner;

public class Degrees {
	public static void main(String[] args) {
		// ȭ���µ� => �����µ�
		
		
		// ����
		Scanner sc = new Scanner(System.in);
		System.out.print("ȭ���µ� �Է� : ");
		
		// ȭ���µ� �Է¹ޱ�(����)
		int fahr = sc.nextInt();
		
		// ���� ȭ���µ�=> �����µ��� ��ȯ �� ����ϱ�
		// (ȭ���µ�-32)*5/9 
		double cels=(fahr-32)*5/9.0;
		System.out.println("�����µ� : "+cels);
		System.out.printf("�����µ� : %.4f",cels);
	}
}


















