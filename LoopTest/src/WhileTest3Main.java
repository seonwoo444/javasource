import java.io.IOException;

public class WhileTest3Main {
	public static void main(String[] args) throws IOException {
		
		boolean run = true;
		int keyCode =0; int speed = 0;
		
		while (run) {//(i<10) or (true, false) 둘다 가능 단지 true, false인지 판단하기 위한 자리
			if (keyCode!=13 && keyCode !=10) {
				System.out.println("===================");
				System.out.println("1. 종속 | 2. 감속 | 3. 중지");
				System.out.println("===================");
				System.out.print("선택 :");
			}
			
			keyCode = System.in.read();
			
			if(keyCode == 49) {
				speed++;
				System.out.println("현재속도 = "+speed);
			}else if(keyCode==50) {
				speed--;
				System.out.println("현재속도 = "+speed);
			}else if (keyCode==51) {
				
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
