package test;

public class BreakTest2 {

	public static void main(String[] args) {
		// ���ڸ� 0�������� �ϳ��� ������Ű�鼭 �հ踦 ���ϱ�
		// ��, �հ谡 100�� ������ �ݺ��� ����
		
		int sum=0,i=0;
		
		while(true) {
			if(sum > 100) {
				break;
			}
			
			sum += i;
			i++;
		}
		System.out.printf("i = %d, sum = %d",i,sum);
	}

}






