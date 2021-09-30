
public class SubscriberMainEx {

	public static void main(String[] args) {
		SubscriberMain subscriber = new SubscriberMain("홍길동", "jfi123", "3478");
		SubscriberMain subscriber2 = new SubscriberMain("이선우", "lsw444", "2037", "010-5547-2482", "서울시 동대문구");

		// 이름 추가 하고 싶으면
		subscriber.setTel("010-5547-2482");
		
		//주소 변경
		subscriber2.setAddr("서울시 성동구");
		
		
	}

}
