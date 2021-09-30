package api;

public class SmartPhoneEx {

	public static void main(String[] args) {
		SmartPhone phone1 = new SmartPhone("삼성","안드로이드");
		SmartPhone phone2 = new SmartPhone("애플","ios");
		
		System.out.println(phone1);// == phone1.toString();
		System.out.println(phone2);// == phone2.toStting():
		//부모가 상속해준 주소를 출력하게 된다.
		//그게 싫다면 오버라이딩 시켜서 값을 출력 하면 된다.
		// 책 11장 내용
		//java.lang 패키지를 주로 사용하게 될 것
		//끝나고 책 15장 
		//java.util 패키지 자주 쓸 예정
		//18장
		//java.io
		//jdbc => (책에 없음) 자바 + 데이터베이스
		// 다음 웹으로 넘어감
	}

}
