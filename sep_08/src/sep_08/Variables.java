package sep_08;

public class Variables {
	//private int iv; : 인스턴스 변수, 속성, 프로퍼티, 멤버변수, 필드
	//static int cv; : 클래스 변수, static변수
	
	public Variables(int iv) {// {중괄호 안에 있으면} 지역변수
		
	}
	
	void method(int a) {
		// 지역변수 자리
		int sum = 0;
	}
}

//생성 시기 
// 클레스 변수 : 클래스가 메모리에 올라갈 때( 제일 먼저 실해
// 인스턴스 변수 : 객체 생성될 때
// 지역변수 : 변수 선언문이 수행될 때
