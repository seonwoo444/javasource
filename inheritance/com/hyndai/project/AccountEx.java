package com.hyndai.project;

import java.util.Scanner;

// ���� ��Ű���� �ƴ� Ŭ������ �ҷ��� �� �ʿ�
import com.samsung.project.Account;

public class AccountEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		// ȫ�浿 ����
		Account account1 = new Account("122-01-12222",10000,"ȫ�浿");
		// The field Account.accountNo is not visible
//		account1.accountNo="122-01-12222";
//		account1.balance=10000;
//		account1.name="ȫ�浿";
		
		//�Ա�
		account1.deposit(50000);
		
		//���
		System.out.println("���� �ܾ� : "+account1.withdraw(30000));

	}

}
