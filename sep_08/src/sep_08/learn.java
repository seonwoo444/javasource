package sep_08;

import java.util.Scanner;

public class learn {
	
	//패키지는 클래스를 모아놓은 폴더 개념
	//접근 제어자를 통해 패키지 끼리 클래스 공유 여부를 결정한다
	//패키지 선언 후
	//import를 해주어야 사용 가능
	// 접근 제어자
	//public, protected, default(package), private
	// -> 갈수록 강화됨
	//public(접근제한이 없음) : 클래스, 필드(멤버변수), 생성자, 메소드
	//protected(자식 클래스가 아닌 다른 패키지에 있는 클래스 접근 불가) : 필드, 생성자, 메소드
	//default(package = 다른 패키지에 있는 클래스 접근 불가) : 클래스, 필드, 생성자, 메소드
	//private(모든 외부 클래스 접근 불가) : 필드, 생성자, 메소드

	//	==================

	//	클레스, 생성자, 메소드 => 주로 public
	//	필드 => private
	
	String name1; // default = 앞에 접근 제어자를 명시하지 않고 아무것도 안붙인 상태에선
	// 다른 패키지로 이동 할 시 이동된 패키지 제외하고 사용할 수 없다.
	
	public String name2;//public 어떤 패키지서든 사용이 가능
	
	//import java.util.Scanner; 위에 임포트 시킴
	Scanner sc = new Scanner(System.in);
	//Scanner라는 자바 안에 클레스(import java.util.Scanner;)를 해당 패키지에서도 사용하기 위해 import 시키고 사용
	
	
	
	
	
	
	
	
	
	
	
	
	
}
