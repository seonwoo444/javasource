import java.util.Scanner;

// alt �� �� : ���� ���� ����
public class ConsoleInputMain {
	public static void main(String[] args) {
		// Ű���� �Է¹��� �غ�
		Scanner k = new Scanner(System.in);

		// �Ĵ� �̸� �Է¹ޱ�
		System.out.print("�Ĵ� �̸� : ");

		// �ֿܼ� �Է��� ������ name�� ����
		String restor = k.next();

		System.out.print("�Ĵ� ũ�� : ");

		double size = k.nextDouble(); // -> int aa = k.nextint...��� ��Ʈ���� ����

		// ���̺� ��

		System.out.print("���̺� �� : ");
		int table = k.nextInt();

		// ������

		System.out.print("������ : ");
		boolean open = k.nextBoolean();
		
		k.close();
		
		System.out.println("*********");
		System.out.println(restor);
		System.out.println(size);
		System.out.println(table);
		System.out.println(open);
		System.out.println("*********");

	}
}
