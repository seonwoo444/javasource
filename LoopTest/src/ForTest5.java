

public class ForTest5 {
	public static void main(String[] args) {
		// **********
		// **********
		// **********
		// **********
		// **********

		// ���� for�� ���� ����
		// 1. int i = 0
		// 2. i < 3
		// 3. ���� for���� int i=0
		// 4. ���� j < 3
		// 5. System.out.println("*"); *
		// 6. ���� j++ => j = 1
		// 7. j < 3
		// 8. System.out.println("*"); **
		// 9. j++ => j = 2
		// 10. j<3
		// 11. System.out.println("*"); ***\
		// 12. j++ => j = 3
		// 13. j < 3 => ���� for�� ����
		// 14. System.out.println();

		// �ٽ�
		// 1. i++ i = 1
		// 2. i<3
		// 3. ���� for���� int j=0 ~ 14������ ����

		// i++ => i = 2
		// i < 3
		// 3. ���� for���� int j=0 ~ 14������ ����

		// i++ => i=3
		// i < 3 => ����
		// for (int i = 0; i < 5; i++) {
		// for (int j = 0; j < 11; j++) {
		// System.out.print("*");
		// }
		// System.out.println();

		// 1~100 ���� ���� �߿��� 3�� ������� ���ϴ� ���α׷� �ۼ�
		// ��. 9�� ����� ������ �ʱ�
//		int sum = 0;
//		for (int j = 1; j < 101; j++) {
//			if (j % 3 == 0 && j % 9 != 0) {
//				sum = sum + j;
//			}
//			System.out.println("3�� ����̰� 9�� ����� �ƴ� ��: " + sum);
//		}
//			//1~100���� ���� �߿��� 3�� ����̰ų�, 5�� ����� ���� ��
//		sum = 0;
//		for (int i = 1; i < 101; i++) {
//			if (i % 3 == 0 || i % 5 == 0) {
//				sum = sum+i;
//			}
//			System.out.println("3�� ����̰ų�, 5�� ����� ���� �� : " + sum);
//		}
		//System.out.println();
		
//		for (int i = 1; i <=5; i++) {
//			System.out.print("*");
//		}
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
