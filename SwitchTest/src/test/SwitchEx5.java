package test;

import java.util.Scanner;

public class SwitchEx5 {
	public static void main(String[] args) {
		// ��������� ���� 2�� �Է� �ޱ�
		// ������ �Է¹ޱ�(+, -, *, /, %)

		// switch (������)
		// ���� �� ��� ��� ���

		Scanner k = new Scanner(System.in);
		System.out.print("ù��° �� �Է� : ");
		int a = k.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		int b = k.nextInt();

		System.out.print("������ �Է� : ");
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
//			System.out.println("�����ڸ� Ȯ���� �ּ���");
//			break;
		}
		System.out.printf("%d %s %d = %d", a,op,b,result);
	}
}
