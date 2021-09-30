
public class SubscriberMain {
	//속성 - 이름, 아이디, 패스워드, 전화번호, 주소
	private String name;
	private String id;
	private String pasword;
	private String tel;
	private String addr;
	
	
	//생성자 - 이름, 아이디, 패스워드만 초기화 후 객체 생성
	public SubscriberMain(String name, String id, String pasword) {
		super();
		this.name = name;
		this.id = id;
		this.pasword = pasword;
	}
	
	//		- 이름, 아이디, 패스워드, 전화번호, 주소를 초기화 한 후 객체 생성
	public SubscriberMain(String name, String id, String pasword, String tel, String addr) {
		super();
		this.name = name;
		this.id = id;
		this.pasword = pasword;
		this.tel = tel;
		this.addr = addr;
	}

	//기능 - 패스워드 변경, 전화번호를 변경, 주소 변경
	
	//setter 메소드로
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
