import java.util.Scanner;

public class OperatorMain {
	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);
		
		System.out.print("x : ");
		
		int xx = k.nextInt();
		
		System.out.print("y : ");
		
		int yy = k.nextInt();
		
		System.out.println("--------------");
		System.out.printf("x�� %d, y�� %d\n", xx, yy);
		
		// ������
		// = : ���Կ�����, ���׿� �ִ°� ���ʿ� ���� - ��� �������� ���� �������� �ߵ�
		//���������
		// + : 
		//			String + ���� => �ٿ��� String����
		// -
		// *
		// / : 
		//		int / int => ������  int�� -> ���ϴ� ������ ����
		// 									�� �߿� �ϳ��� �Ǽ����̾�� �Ǽ������� ���� ���´�
		//										double / double double / int
		// % : ������ ���� ��
		int a = xx + yy;
		int b = xx - yy;
		int c = xx * yy;
		double d = xx / yy;
		int dd = xx / yy;
		double ddd = xx / (double) yy;
		int e = xx % yy;
		
		System.out.println(a);
		System.out.println("����" + b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(dd);
		System.out.println(ddd);
		System.out.println(e);
		
		String laugh = "��";
		String aa = xx + laugh;
		System.out.println(aa);
		
		String bb = "����" + b;
		System.out.println(bb);
		

		// ������������(���������+���Կ�����)
		// +=
		// -=
		// *=
		// /=
		// %=
		// xx += 5
		xx += 5;
		System.out.println(xx);
		
		yy -= 3;
		System.out.println(yy);
		
		xx *= 2;
		System.out.println(xx);
		
		yy /= 2;
		System.out.println(yy);
		
		xx %= 3;
		System.out.println(xx);
		System.out.println("-------");
//		xx = xx + 1;
//		xx += 1;
		xx++; //(�ϳ��� �ø��Ÿ�)
		System.out.println(xx);
		// ����������
		// ++ : �ϳ� �ø���
		// -- : �ϳ� ������
		
		
		
		
		
	}
}
