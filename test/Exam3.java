package test;

import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		boolean run = true;
		
		//�ܾ�
		int balance = 0;		
		
		Scanner sc = new Scanner(System.in);		
		
		while(run) {
			System.out.println("**************************************");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("**************************************");
			System.out.print("���� >>> ");
			
			int menu = sc.nextInt();
			
			// 1 ���� : ��������� ���ݾ� �Է¹ޱ� => balance �߰�
			// 2 ���� : ��������� ��ݾ� �Է¹ޱ� => balance ����
			// 3 ���� : balance ���
			// 4 ���� : run = false ���� �� ���α׷� ����
			switch (menu) {
				case 1:
					System.out.print("���ݾ� >> ");
					balance+=sc.nextInt();
					
//					int money = sc.nextInt();
//					balance = balance += money; // balance+=money;
					break;
				case 2:
					System.out.print("��ݾ� >> ");
					balance -= sc.nextInt();
					break;
				case 3:
					System.out.println("�ܾ� >> "+balance);
					break;
				case 4:
					run = false;
					break;
				default:
					System.out.println("�޴� Ȯ��");
					break;
			}
			
			
		}

	}
}









