
public class WhileTest1Main {
	public static void main(String[] args) {
		//
		int i=0;
		while (i<10) {
			//�ݺ��ؾ� �� �۾�
			System.out.println("�ȳ��ϼ���");
			i++;
		}
		System.out.println();
		
		i=1;
		while (i<11) {
			System.out.print(i+"\t");
			i++;
		}
		System.out.println();
		i=0;
		while (i<11) {
			System.out.print(i+"\t");
			i+=2;
		}
		System.out.println();
		i=3;
		while (i<100) {
			System.out.print(i+"\t");
			i+=3;
		}
		
	}
}
