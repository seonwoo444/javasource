

public class AccountMain2 {

	//속성 : 계좌번호, 잔액, 이름
	//기능 : 입금한다(입력값 : 입금액, 반환값 없음) => 현재잔액 += 입금액
//			출금한다(입력값 : 출금액, 반환값 : 현재잔액) => 현재잔액 -= 출긂액

	// 기본 생성자
	
	private String AcNum;
	private int x;
	private String name;
	
	//기본생성자
	// [마우스 오른쪽] - [source] - [Generate Constructor using Fields..] => 일반 생성자 만들때
	// [마우스 오른쪽] - [source] - [Generate Constructor using Super class..] => default 만들때
	
	public AccountMain2() {
		super();
	}

	public AccountMain2(String acNum, int x, String name) {
		super();
		AcNum = acNum;
		this.x = x;
		this.name = name;
	}
	
	public AccountMain2(String acNum, String name) {
		super();
		AcNum = acNum;
		this.name = name;
	}

	//외부로부터 값을 받아서 멤버변수의 값을 변경하는 작업시
	// set~으로 메소드를 작성한다.
	
	//멤버변수 : 계좌번호를 변경하고 싶다면
	public void setAcNum(String acNum) {
		this.AcNum = acNum;
	}
	// 이름을 변경
	public void setName(String name) {
		this.name = name;
	}
	// 잔액
	public void setX(int x) {
		this.x = x;
	}
	
	// 멤버 변수의 값을 리턴하고 싶다
	//get~으로 시작
	public int getX() {
		return x;
	}
	


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
