package test;

import java.util.Scanner;

public class ForTest4 {
	public static void main(String[] args) {
		// ��������� �������� �ܼ��� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� �� �Է� : ");
		int num = sc.nextInt(); //5, 6,...

		for(int i=1;i<10;i++) {
		//	System.out.println(num+" * "+i+" = "+(num*i));
			System.out.printf("%d * %d = %d\t",num,i,(num*i));
		}
		
	}
}


