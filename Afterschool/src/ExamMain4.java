import java.util.Scanner;

public class ExamMain4 {
	public static void main(String[] args) {
			//������ �Է��ϰ� �������� 0�� �Է��ϼ���
		// 10 30 -20 40 0
		// �Է��� ���� ������ 4���̸� ����� 15.0�Դϴ�.
		
		Scanner k = new Scanner(System.in);
		System.out.println("������.........");
		
		int num;
		int count = 0;
		int sum = 0;
		
		while ((num = k.nextInt())!=0) {
			sum += num;
			count++;
		}
		
		
		System.out.printf("�Է��� ���� ������ %d���̸� ����� %.1f�Դϴ�.",count,(double)sum/count);
//		System.out.println("�Է��� ���� ������"+count+"���̸� �����"+sum/count+"�Դϴ�.");
		
	}
}
