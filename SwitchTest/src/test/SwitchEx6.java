package test;

import java.util.Scanner;

public class SwitchEx6 {

	public static void main(String[] args) {
		//(����	1) ����	2	�� 3
		
		// ���� - ��ǻ��
		// ���� ���� 1~3���� �ڵ����� ����
		
		//������ �����ϴ� �κ� - �Է�(����)
		//��¹� ����� �����ϴ� / ����� �̰���ϴ� / �����ϴ�.
		
		Scanner k = new Scanner(System.in);
		System.out.print("��� : ");
		int you = k.nextInt();
		
		int comp = (int)(Math.random()*3)+1;
		System.out.printf("��ǻ�� : %d\n", comp);
		
		switch (you-comp) {
		case 2: case -1:
			System.out.println("����� �����ϴ�");
			break;
		case 1: case -2:
			System.out.println("����� �̰���ϴ�");
			break;
		case 0:
			System.out.println("�����ϴ�");
			break;
		}
		
	}

}
