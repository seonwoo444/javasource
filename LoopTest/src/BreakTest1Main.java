
public class BreakTest1Main {
	public static void main(String[] args) {
		
		while (true) {
			// 주사위를 굴려 6이 나오면 반복문을 종
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			
			if(num==6);
				break;//반복문 실행 중지
		}
		
	}
}
