package com.samsung.project;

public class Account {
	//�Ӽ� : ���¹�ȣ(122-01-12222),�ܾ�,�̸�
	private String accountNo; 
	private int balance;
	private String name;
	
	//�⺻������
	public Account(String accountNo, int balance, String name) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
		this.name = name;
	}
	
	
	
	
	
	//��� : �Ա��Ѵ�.(�Է°� : �Աݾ�, ��ȯ��:����) => �����ܾ� += �Աݾ�
	public void deposit(int amount) {
		balance += amount;
	}
	
	


	//       ����Ѵ�.(�Է°� : ��ݾ�, ��ȯ��:�����ܾ�) => �����ܾ� -= ��ݾ�
	public int withdraw(int amount) {
		if(balance > amount) {
			balance -= amount;			
		}
		return balance;
	}
}








