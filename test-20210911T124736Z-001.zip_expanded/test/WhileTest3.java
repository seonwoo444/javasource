package test;

import java.io.IOException;

public class WhileTest3 { //p126
	public static void main(String[] args) throws IOException {
		
		boolean run = true;
		int keyCode = 0,speed = 0;
		
		while(run) {
			// 13 => CR && 10 => LF : ���� (\r\n)
			if(keyCode!=13 && keyCode != 10) {
				System.out.println("=========================");
				System.out.println("1. ���� | 2. ���� | 3. ����");
				System.out.println("=========================");
				System.out.print("���� : ");
			}
			
			// int java.io.InputStream.read() throws IOException
			keyCode = System.in.read(); // 1 => 49, 2 => 50, 3 => 51
			
			if(keyCode == 49) {
				speed++;
				System.out.println("���� �ӵ� = "+speed);
			}else if(keyCode==50) {
				speed--;
				System.out.println("���� �ӵ� = "+speed);
			}else if(keyCode==51) {
				run = false;				
			}			
		}
		System.out.println("���α׷� ����");
		

	}
}


