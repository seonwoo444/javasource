import java.util.Iterator;

public class ForTest1 {
	public static void main(String[] args) {

		// �ݺ��ؾ��� �۾� ���

		// for ���� ����
		// 1. int i = 0;
		// 2. i < 10;
		// 3. �ݺ��ؾ��� �۾��� ����
		// -> System.out.println("�ȳ�");
		// 4. i++ (i=i+1) => i=1
		// 5. i < 10
		// 6. �ݺ��ؾ� �� �۾� ����
		// 7. i++ (i=i+1) => i = 2
		// 8. i < 10;
		// 9. �ݺ��ؾ� �� �۾�.........
		// i = 10
		// i < 10; ���� �Ҹ��� => for ������ �������� => for�� ����
		for (int i = 0; i < 10; i++) {
			System.out.println("�ȳ�");
		}

		System.out.println();

		// 1~10���� ���
		//1. int i = 1
		//2. i < 11
		//3. System.out.println(i);
		//4. i++
		//5. i < 11
		//6. System.out.println(i);
		//..........
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		// 0~10���� ¦���� ���
		for (int i = 0; i < 11; i+=2) {
			System.out.print(i+"\t");
		}
		
		System.out.println();
		
		// 3 6 9....3�� �����
		for (int i = 3; i < 101; i+=3) {
			System.out.print(i+"\t");
		}
	}
}
