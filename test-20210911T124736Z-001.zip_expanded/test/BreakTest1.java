package test;

// break; �ݺ��� ���� ����
public class BreakTest1 {
	public static void main(String[] args) {
		
		while(true) {
			//�ֻ����� ������ 6�� ������ �ݺ��� ����
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			
			if(num == 6) {
				break;
			}
		}

	}
}
