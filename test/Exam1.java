package test;

public class Exam1 {
	public static void main(String[] args) {
		
		while(true) {
			//�ֻ��� 2 �� ������
			int dice1 = (int)(Math.random()*6)+1;
			int dice2 = (int)(Math.random()*6)+1;
			
			//������ �ֻ��� �� ���  (1,4)
			System.out.printf("(%d, %d)\n",dice1,dice2);
			
			// �ֻ��� ���� �հ谡 5�� �ƴϸ� �ֻ����� ��� ������
			// 5�� �Ǹ� ������ ���߱�
			if(dice1+dice2 == 5) {
				break;
			}
		}
		

	}
}







