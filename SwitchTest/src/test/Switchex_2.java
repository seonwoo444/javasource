package test;

public class Switchex_2 {
	public static void main(String[] args) {
		char grade = 'c';
		// A or a => 우수 회원
		// B or b => 일반 회원
		// 아무것도 없음 => 손님

		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원");
			break;
		default:
			System.out.println("손님");
			break;// 생략 가능(거의 의미 없음)
		}
		
		if (grade == 'A' || grade == 'a') {
			System.out.println("우수 회원");
		}else if (grade == 'B' || grade == 'b') {
			System.out.println("일반 회원");
		}else
			System.out.println("손님");
	}

}