package test;

import java.util.Scanner;

public class SwitchEx5 {
	public static void main(String[] args) {
		// ��������� ���� 2�� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° �� �Է� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° �� �Է� : ");
		int num2 = sc.nextInt();
		
		// ������ �Է¹ޱ�(+,-,*,/,%) 
		System.out.print("������ �Է�(+,-,*,/,%) : ");
		// + / * => '+' or "+"
		String op = sc.next();
		
		// switch(������)
		// ���� �� ��� ��� ���
		int result = 0;
		switch (op) {
		case "+":
			result = num1 + num2;
			//System.out.println(num1+ op + num2 + "=" + (num1+num2));
			break;
		case "-":
			result = num1 - num2;
			//System.out.println(num1+ op + num2 + "=" + (num1-num2));		
			break;
		case "*":
			result = num1 * num2;
			//System.out.println(num1+ op + num2 + "=" + (num1*num2));
			break;
		case "/":
			result = num1 / num2;
			//System.out.println(num1+ op + num2 + "=" + (num1/num2));
			break;
		case "%":
			result = num1 % num2;
			//System.out.println(num1+ op + num2 + "=" + (num1%num2));
			break;
//		default:
//			System.out.println("�����ڸ� Ȯ���� �ּ���");
//			break;
		}
		System.out.printf("%d %s %d = %d",num1,op,num2,result);
	}
}
















