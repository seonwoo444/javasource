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
			//강제로 예외 발생
			throw new BalanceInsufficientException("잔고부족");
		}
		balance -= money;
	}
}
