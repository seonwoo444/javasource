import java.util.Scanner;

public class DoWhileTest3 {

	public static void main(String[] args) {
		// ��ǻ�Ͱ� 1~100 ������ ������ ���Ƿ� ����
		// ����ڴ� ��ǻ�Ͱ� ������ �ִ� ���ڰ� �������� �˾Ƹ��߱�
		
		int answer = (int)(Math.random()*100)+1;
		
		Scanner k = new Scanner(System.in);
		
		answer = (int)(Math.random()*100)+1;
		int input = 0;
		
		do {
			
			System.out.print("������ ���� : ");
			input = k.nextInt();
			
			if (input < answer) {
				System.out.println("�� �� ū���� �Է����ּ���");
			}else {
				System.out.println("�� �� ���� ���� �Է����ּ���");
			}
		} while (input != answer); 

	}

}
