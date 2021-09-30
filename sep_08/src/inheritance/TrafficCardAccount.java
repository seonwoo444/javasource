package inheritance;
//Account2
//CheckingAccount
public class TrafficCardAccount extends CheckingAccount {

// CheckingAccount가 다 갖고있는 기능 계좌번호, 계좌주, 잔액, 카드번호, 교통카드 기능여부
// CheckingAccount가 다 갖고있는 기능 입금한다, 출금한다, 체크카드
	private boolean hasTrafficCard;

public TrafficCardAccount(String acNum, int x, String name, String cardNo, boolean hasTrafficCard) {
		super(acNum, x, name, cardNo);
		this.hasTrafficCard = hasTrafficCard;
	}	
//교통카드 기능이 있다면 교통비를 지불
	//입력값 : 카드번호, 교통비 사용액
	//반환값 : 정수
	
int pay(String cardNo, int amount) {
	if (!hasTrafficCard) {
		System.out.println("교통카드인지 확인해주세요");
		return 0;
	}
	
	return pay(cardNo, amount);

}
	
}
