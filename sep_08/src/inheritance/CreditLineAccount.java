package inheritance;

public class CreditLineAccount extends AccountMain2 {
//계좌번호, 계좌주, 잔액, 마이너스한도 / 입금하다, 출금하다
	
	private int creditLine; //마이너스 한도
	
	public CreditLineAccount(String accountNo, int x, String name, int creditLine) {
		super(accountNo, x, name);
		this.creditLine = creditLine;
	}
	   
	
	//출금하다 오버라이딩
	//부모의 기능 : 출금하다 = 잔액 - 출금액
	//자식의 기능 : 출금하다 = 잔액(현재잔액 + 마이너스 한도) - 출금액
	@Override
		int subAccount(int amount) {
		if (getX()+creditLine<amount) {
			System.out.println("인출불가");
			return 0;
		}
		setX(getX()-amount);

			return getX();
		}
	
	
	
	
	
	
	
}
