
public class Exam1 {

	public static void main(String[] args) {
		// �ֻ��� 2�� ������
		// ���� �� ���
		// �ֻ��� ���� �հ谡 5�� �ƴϸ� �ֻ����� ��� ������
		// 5�� �Ǹ� ������ ���߱�
		while (true) {

			int a = (int) (Math.random() * 6) + 1;
			int b = (int) (Math.random() * 6) + 1;

			System.out.printf ("(%d,%d)\n", a,b);
			
			if (a + b == 5) {
				break;
			}
		}
	}

}
