package math;
//java.lang ��Ű���� �⺻������ import�� �Ǿ� ����
//�ϳ��� Ŭ������ ��� �޼ҵ尡 static �޼ҵ�� �����Ǿ� �ִٸ�
//import static ���� ���
import static java.lang.Math.*;

public class MathEx2 {
	public static void main(String[] args) {
		Math.random();// 0<=Math.random()<1

		// �� ���� �������� ���ϱ�(1~3)
		// 1 1 1 ���� ���� ������ stop

		while (true) {

			int a = (int) (random() * 3) + 1;
			int b = (int) (random() * 3) + 1;
			int c = (int) (random() * 3) + 1;
			System.out.printf("%d\t%d\t%d\n", a, b, c);
			if (a == b && a == c) {
				break;
			}

		}

	}
}
