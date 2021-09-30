import java.util.Iterator;

public class ForTest1 {
	public static void main(String[] args) {

		// 반복해야할 작업 기록

		// for 실행 순서
		// 1. int i = 0;
		// 2. i < 10;
		// 3. 반복해야할 작업이 실행
		// -> System.out.println("안녕");
		// 4. i++ (i=i+1) => i=1
		// 5. i < 10
		// 6. 반복해야 할 작업 실행
		// 7. i++ (i=i+1) => i = 2
		// 8. i < 10;
		// 9. 반복해야 할 작업.........
		// i = 10
		// i < 10; 조건 불만족 => for 루프를 빠져나감 => for문 종료
		for (int i = 0; i < 10; i++) {
			System.out.println("안녕");
		}

		System.out.println();

		// 1~10까지 출력
		//1. int i = 1
		//2. i < 11
		//3. System.out.println(i);
		//4. i++
		//5. i < 11
		//6. System.out.println(i);
		//..........
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		// 0~10까지 짝수만 출력
		for (int i = 0; i < 11; i+=2) {
			System.out.print(i+"\t");
		}
		
		System.out.println();
		
		// 3 6 9....3의 배수만
		for (int i = 3; i < 101; i+=3) {
			System.out.print(i+"\t");
		}
	}
}
