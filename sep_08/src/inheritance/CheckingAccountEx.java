package inheritance;

public class CheckingAccountEx {

	public static void main(String[] args) {
		CheckingAccount checkingAccount = new CheckingAccount("122-12",200000,"이선우","122-12-123");
		
		System.out.println("현재잔액 : "+checkingAccount.pay("122-12-123",20000));

		
		
		
	}

}
