package test;

public class Switchex_2 {
	public static void main(String[] args) {
		char grade = 'c';
		// A or a => ��� ȸ��
		// B or b => �Ϲ� ȸ��
		// �ƹ��͵� ���� => �մ�

		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("��� ȸ��");
			break;
		case 'B':
		case 'b':
			System.out.println("�Ϲ� ȸ��");
			break;
		default:
			System.out.println("�մ�");
			break;// ���� ����(���� �ǹ� ����)
		}
		
		if (grade == 'A' || grade == 'a') {
			System.out.println("��� ȸ��");
		}else if (grade == 'B' || grade == 'b') {
			System.out.println("�Ϲ� ȸ��");
		}else
			System.out.println("�մ�");
	}

}