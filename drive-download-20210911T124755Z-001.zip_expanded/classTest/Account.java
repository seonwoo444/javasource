package classTest;

public class Account {
	//�Ӽ� : ���¹�ȣ(122-01-12222),�ܾ�,�̸�
	String accountNo; 
	int balance;
	String name;
	
	//�⺻������
	
	//��� : �Ա��Ѵ�.(�Է°� : �Աݾ�, ��ȯ��:����) => �����ܾ� += �Աݾ�
	void deposit(int amount) {
		balance += amount;
	}
	
	
	//       ����Ѵ�.(�Է°� : ��ݾ�, ��ȯ��:�����ܾ�) => �����ܾ� -= ��ݾ�
	int withdraw(int amount) {
		if(balance > amount) {
			balance -= amount;			
		}
		return balance;
	}
}








