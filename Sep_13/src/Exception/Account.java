package Exception;

public class Account {
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance+=money;
	}
	public void withdraw(int money) throws Exception {
		if (balance < money) {
			//������ ���� �߻�
			throw new BalanceInsufficientException("�ܰ����");
		}
		balance -= money;
	}
}
