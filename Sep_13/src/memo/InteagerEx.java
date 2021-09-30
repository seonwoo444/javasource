package memo;

import java.util.Scanner;

public class InteagerEx {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요");
		// 5 => "5"
		String input = sc.next();
		System.out.println(input+5); // + = 연결의 의미
		
		//무조건 외우기
		//"5" => 5
		//문자열 숫자를 int 숫자로
		int num = Integer.parseInt(input);
		System.out.println(num+5);

	}

}
