import java.io.IOException;

public class WhileTest3Main {
	public static void main(String[] args) throws IOException {
		
		boolean run = true;
		int keyCode =0; int speed = 0;
		
		while (run) {//(i<10) or (true, false) �Ѵ� ���� ���� true, false���� �Ǵ��ϱ� ���� �ڸ�
			if (keyCode!=13 && keyCode !=10) {
				System.out.println("===================");
				System.out.println("1. ���� | 2. ���� | 3. ����");
				System.out.println("===================");
				System.out.print("���� :");
			}
			
			keyCode = System.in.read();
			
			if(keyCode == 49) {
				speed++;
				System.out.println("����ӵ� = "+speed);
			}else if(keyCode==50) {
				speed--;
				System.out.println("����ӵ� = "+speed);
			}else if (keyCode==51) {
				
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
}
