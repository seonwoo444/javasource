package test;

import java.util.Scanner;

public class SwitchEx5 {
	public static void main(String[] args) {
		// 사용자한테 숫자 2개 입력 받기
		// 연산자 입력받기(+, -, *, /, %)

		// switch (연산자)
		// 연산 후 계산 결과 출력

		Scanner k = new Scanner(System.in);
		System.out.print("첫번째 수 입력 : ");
		int a = k.nextInt();
		System.out.print("두번째 수 입력 : ");
		int b = k.nextInt();

		System.out.print("연산자 입력 : ");
		// + / * => '+' or "*"
		String op = k.next();
		int result = 0;
		switch (op) {
		case "+":
			result = a+b;
			//System.out.println(a + op + b + "=" + (a + b));
			break;
		case "-":
			result = a-b;
//			System.out.println(a + op + b + "=" + (a - b));
			break;
		case "*":
			result = a*b;
//			System.out.println(a + op + b + "=" + (a * b));
			break;
		case "/":
			result = a/b;
//			System.out.println(a + op + b + "=" + (a / b));
			break;
		case "%":
			result = a%b;
//			System.out.println(a + op + b + "=" + (a % b));
			break;
//		default:
//			System.out.println("연산자를 확인해 주세요");
//			break;
		}
		System.out.printf("%d %s %d = %d", a,op,b,result);
	}
}
