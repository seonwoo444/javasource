import java.io.IOException;
import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) throws IOException {
			boolean run = true;
			
			int balance = 0;
			int keyCode = 0;
			Scanner k = new Scanner(System.in);
			
			while (run) {
				System.out.println("*************************");
				System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
				System.out.println("*************************");
				System.out.print("����>>>");
				//1. ���� : ��������� ���ݾ� �Է¹ޱ� => balance �߰�
				//2. ���� : ��������� ��ݾ� �Է¹ޱ� => balance ����
				//3. ���� : balance ���
				//4. ���� : run = false ���� �� ���α׷� ����
				keyCode = System.in.read();
				
				if(keyCode == 49) {
					System.out.print("���ݾ� = ");
					balance += k.nextInt();
//					int money = k.nextInt();
//					System.out.println(balance+=money);
					break;
				}else if(keyCode==50) {
					System.out.print("��ݾ� = ");
					balance-= k.nextInt();
					break;
				}else if (keyCode==51) {
					System.out.print("�ܾ� : "+balance);
					break;
				}else if (keyCode==52) {
					
					run = false;
				}
				
				
			}
	}
}
