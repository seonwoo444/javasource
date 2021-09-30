package math;
//java.lang 패키지는 기본적으로 import가 되어 있음
//하나의 클래스에 모든 메소드가 static 메소드로 구성되어 있다면
//import static 만들어서 사용
import static java.lang.Math.*;

public class MathEx2 {
	public static void main(String[] args) {
		Math.random();// 0<=Math.random()<1

		// 세 개의 랜덤값을 구하기(1~3)
		// 1 1 1 같은 값이 나오면 stop

		while (true) {

			int a = (int) (random() * 3) + 1;
			int b = (int) (random() * 3) + 1;
			int c = (int) (random() * 3) + 1;
			System.out.printf("%d\t%d\t%d\n", a, b, c);
			if (a == b && a == c) {
				break;
			}

		}

	}
}
