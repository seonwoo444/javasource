package exam;

import java.util.Scanner;

public class Degrees {
	public static void main(String[] args) {
		//ȭ���µ� => ���� �µ�
		
		//����
		//ȭ���µ� �Է¹ޱ�(����)
		
		//���� ȭ���µ� => �����µ��� ��ȯ �� ����ϱ�
		//(ȭ���µ� -32)*5/9
		Scanner k = new Scanner(System.in);
		System.out.print("ȭ���µ� : ");
		
		int temp = k.nextInt();
		
		double cels = (temp-32)*5/9.0;
				System.out.println("�����µ� : " + cels);
				System.out.printf("�����µ� : %.3f\n" , cels);
		
	}

}
