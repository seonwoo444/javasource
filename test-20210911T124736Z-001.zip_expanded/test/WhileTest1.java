package test;

public class WhileTest1 {
	public static void main(String[] args) {
//		for(int i=0;i<10;i++) {
//			//�ݺ��ؾ��� �۾�
//			System.out.println("�ȳ��ϼ���");
//		}
		
		int i=0;
		while(i<10) {
			//�ݺ��ؾ��� �۾�
			System.out.println("�ȳ��ϼ���");
			i++;
		}
		
		System.out.println();
		
		i=1;
		while(i<11) {
			System.out.print(i+"\t");
			i++;
		}

		
		// 0~10���� ¦���� ���
//		for(int i=0;i<11;i+=2) {
//			System.out.print(i+"\t");
//		}
		System.out.println();
		
		
		i=0;
		while(i<11) {
			System.out.print(i+"\t");
			i+=2;
		}
		
		System.out.println();
		
		// 3 6 9 12... 3 �� ����� ���
//		for(int i=3;i<100;i+=3) {
//			System.out.print(i+"  ");
//		}
		
		i=3;
		while(i<101) {
			System.out.print(i+"  ");
			i+=3;
		}
		
	}
}












