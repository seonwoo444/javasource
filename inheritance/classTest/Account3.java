package classTest;

public class Account3 {
	//�Ӽ� : ���¹�ȣ(122-01-12222),�ܾ�,�̸�
	private String accountNo; 
	private int balance;
	private String name;
	
	
	//������ �ۼ�
	// [���콺������] - [source] - [Generate Constructor using Fields..] => �Ϲݻ�����
	// [���콺������] - [source] - [Generate Constructor using Super class..] => default
	
	
	//�⺻������
	public Account3() {
		super();
	}	
	public Account3(String accountNo, String name) {
		super();
		this.accountNo = accountNo;
		this.name = name;
	}
	public Account3(String accountNo, int balance, String name) {
//		super();
//		this.accountNo = accountNo;
//		this.name = name;
		this(accountNo,name); //this() : �ٸ� ������ ȣ��
		this.balance = balance;
	}	

	//�ܺηκ��� ���� �޾Ƽ� ��������� ���� �����ϴ� �۾���
	// set~ ���� �޼ҵ带 �ۼ��Ѵ�.
	
	
	
	
	
	
	
	// ������� : ���¹�ȣ�� �����ϰ� �ʹٸ�?
	
	
	
	// �̸��� �����ϰ� �ʹٸ�?
	
	
	// ��� ������ ���� �����ϰ� �ʹٸ�?
	// get~~
	public int getBalance() {
		return balance;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	
	public String getName() {
		return name;
	}
	

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setName(String name) {
		this.name = name;
	}


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








