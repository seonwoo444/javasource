package com.hyundai.project;

import java.util.Scanner;

import com.samsung.project.Account;

public class AccountEx {

	
		// TODO Auto-generated method stub

		Account accountArray[] = new Account[100];// �ɹ�����
		Scanner scanner = new Scanner(System.in);
		
		public static void main(String[] args) {
			boolean run = true;
			while(run) {
				System.out.println("--------------------------------------------");
				System.out.println("1.���»��� | 2. ���¸�� | 3. ���� | 4. ���| 5. ����");
				System.out.println("--------------------------------------------");
				System.out.println("���� > ");
				
				int selectNo = Scanner.nextInt();
				if(selectNo == 1) {
					//���»���
					creatAccount();
					
				}else if(selectNo == 2) {
					account 
				}else if(selectNo == 3) {
					
				}else if(selectNo == 4) {
					
				}else if(selectNo == 5) {
					
				}
				
			}
			System.out.println("���α׷� ����");
		
		
		
		
	}
	// ���� ����
	private static void creatAccount() {
		//�迭���� ��� �ִ��� Ȯ�� 
		System.out.println("���¹�ȣ : ");
		String ano = scanner.next();
		System.out.println("������ : ");
		String owner = scanner.next();
		System.out.println("�ܾ� : ");
		int balance = scanner.netInt();
		
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] = null) {
				accountArray[i] = new Account(ano, owner, balance);
				System.out.println("���°� �����Ǿ����ϴ�.");
				break;
			}
		}
		
	}
	
	//�����ϱ�
	private static void dposit() {
		//findAccount ȣ���ؼ� �̿�
	}
	
	// ����ϱ�
	private static void withdraw() {
		//findAccount ȣ���ؼ� �̿�
		
	}
	// Account �迭���� ano�� ������ Account ��ü ã��
	private static Account findAccount(String ano) {
		return null;
		
	}
}
