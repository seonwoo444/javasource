
public class AccountMain {

	//속성 : 계좌번호, 잔액, 이름
	//기능 : 입금한다(입력값 : 입금액, 반환값 없음) => 현재잔액 += 입금액
//			출금한다(입력값 : 출금액, 반환값 : 현재잔액) => 현재잔액 -= 출긂액

	// 기본 생성자
	
	String AcNum;
	int x;
	String name;
	
	AccountMain(){}
	
	 void addAcount(int amount) {
		x+=amount;
	}
	 
	 int subAccount(int amount) {
		 if (x > amount) {
			 x-=amount;			
		}
		 return x;
	 }
}
