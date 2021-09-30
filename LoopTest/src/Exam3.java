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
				System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
				System.out.println("*************************");
				System.out.print("선택>>>");
				//1. 선택 : 사용자한테 예금액 입력받기 => balance 추가
				//2. 선택 : 사용자한테 출금액 입력받기 => balance 차감
				//3. 선택 : balance 출력
				//4. 선택 : run = false 변경 후 프로그램 종료
				keyCode = System.in.read();
				
				if(keyCode == 49) {
					System.out.print("예금액 = ");
					balance += k.nextInt();
//					int money = k.nextInt();
//					System.out.println(balance+=money);
					break;
				}else if(keyCode==50) {
					System.out.print("출금액 = ");
					balance-= k.nextInt();
					break;
				}else if (keyCode==51) {
					System.out.print("잔액 : "+balance);
					break;
				}else if (keyCode==52) {
					
					run = false;
				}
				
				
			}
	}
}
