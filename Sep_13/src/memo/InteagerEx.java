package memo;

import java.util.Scanner;

public class InteagerEx {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��� �ּ���");
		// 5 => "5"
		String input = sc.next();
		System.out.println(input+5); // + = ������ �ǹ�
		
		//������ �ܿ��
		//"5" => 5
		//���ڿ� ���ڸ� int ���ڷ�
		int num = Integer.parseInt(input);
		System.out.println(num+5);

	}

}
