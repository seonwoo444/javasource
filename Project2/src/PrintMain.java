import java.util.Scanner;

public class PrintMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("��ǰ�� : ");
		
		String name = k.next();
		
		System.out.print("���� : ");
		
		int price = k.nextInt();
		
		System.out.print("���� : ");
		
		double weight = k.nextDouble();
		
		double pct = 88.6;
		
		System.out.println("-------");
		
		
		//��������
		// printf �϶��� ������ Ư������ : %s(String���� �ڸ�), %d(�������� �ڸ�), %f(�Ǽ��� ���� �ڸ�)
		//							%05d : �ڸ��� �����ؼ� ���� ���� �ڸ�(54321... �ڸ���)
		// 							%.3f : �ڸ��� �����ؼ� �Ǽ� ���� �ڸ�(.321456...�ڸ���)
		//							%% : %���
		//							%b : boolean
		System.out.printf("��ǰ�� : %s\n", name);
		System.out.printf("���� : %d\n", price);
		System.out.printf("���� : %05d\n", price);
		System.out.printf("���� : %f\n", weight);
		System.out.printf("���� : %.3f\n", weight);
		System.out.printf("%.2f%%\n", pct);
		System.out.printf("%s[%d] - %fg", name, price, weight);
		
	}
}
