package classTest;

public class AccountEx2 {

	public static void main(String[] args) {
		// ȫ�浿 ����
		Account2 account1 = new Account2();

		//�����ڸ� ������� �ʰ� ������� �� �ʱ�ȭ
		account1.setBalance(10000);
		//���¹�ȣ
		account1.setAccountNo("122-01-12222");
		//�̸�
		account1.setName("ȫ�浿");		
		
		//�Ա�
		account1.deposit(50000);
		System.out.println("�Ա� �� �ܾ� : "+account1.getBalance());		
		
		//���
		System.out.println("���� �ܾ� : "+account1.withdraw(30000));
		
		
		
		
		//������ ����
		Account2 account2 = new Account2("122-01-13333", "������");
		System.out.println("���� �ܾ� ��ȸ : "+account2.getBalance());
			
		
		
		//�ں��� ����
		Account2 account3 = new Account2("122-01-13333",1000000,"������");
		System.out.println("���� �ܾ� ��ȸ : "+account3.getBalance());
	}

}














