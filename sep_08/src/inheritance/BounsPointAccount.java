package inheritance;

public class BounsPointAccount extends AccountMain2 {
//계좌번호, 계좌주, 잔액, 보너스포인트 / 입금하다, 출금하다, 보너스 포인트 추가
	private int bonusPoint;
	
	
	
	public BounsPointAccount(String acNum, int x, String name, int bonusPoint) {
		super(acNum, x, name);
		this.bonusPoint = bonusPoint;
	}
	
	//입금하다
	@Override
		void addAcount(int amount) {
			// 예금하다 : 예금액의 0.1%를 보너스 포인트
//		setX(getX()+amount);	
		
		super.addAcount(amount);
		//보너스 포인트 += 예금액의 0.1%보너스 포인트
		bounsPoint += amount+0.01;
		
			
		}
	getBounusPoint
	
	
	
	
	
}
