
public class Exam1 {

	public static void main(String[] args) {
		// 주사위 2개 던지기
		// 나온 눈 출력
		// 주사위 눈의 합계가 5가 아니면 주사위를 계속 던지고
		// 5가 되면 실행을 멈추기
		while (true) {

			int a = (int) (Math.random() * 6) + 1;
			int b = (int) (Math.random() * 6) + 1;

			System.out.printf ("(%d,%d)\n", a,b);
			
			if (a + b == 5) {
				break;
			}
		}
	}

}
