package test;

public class Exam2 {
	public static void main(String[] args) {
		// ��ø for ���� ����ؼ� ������ 4x+5y=60 �� ��� �ظ�
		// ���ؼ� (x,y) ���·� ����ϱ�
		// ��, x,y�� 10 ���� �ڿ���
		for(int x=1;x<=10;x++) {
			for(int y=1;y<=10;y++) {
				if(4*x+5*y==60) {
					System.out.printf("(%d, %d)\n",x,y);
				}
			}
		}

	}
}
