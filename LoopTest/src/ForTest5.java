

public class ForTest5 {
	public static void main(String[] args) {
		// **********
		// **********
		// **********
		// **********
		// **********

		// 이중 for문 실행 순서
		// 1. int i = 0
		// 2. i < 3
		// 3. 안쪽 for문에 int i=0
		// 4. 안쪽 j < 3
		// 5. System.out.println("*"); *
		// 6. 안쪽 j++ => j = 1
		// 7. j < 3
		// 8. System.out.println("*"); **
		// 9. j++ => j = 2
		// 10. j<3
		// 11. System.out.println("*"); ***\
		// 12. j++ => j = 3
		// 13. j < 3 => 안쪽 for문 종료
		// 14. System.out.println();

		// 다시
		// 1. i++ i = 1
		// 2. i<3
		// 3. 안쪽 for문의 int j=0 ~ 14번까지 실해

		// i++ => i = 2
		// i < 3
		// 3. 안쪽 for문의 int j=0 ~ 14번까지 실해

		// i++ => i=3
		// i < 3 => 종료
		// for (int i = 0; i < 5; i++) {
		// for (int j = 0; j < 11; j++) {
		// System.out.print("*");
		// }
		// System.out.println();

		// 1~100 까지 정수 중에서 3의 배수만을 더하는 프로그램 작성
		// 단. 9의 배수는 더하지 않기
//		int sum = 0;
//		for (int j = 1; j < 101; j++) {
//			if (j % 3 == 0 && j % 9 != 0) {
//				sum = sum + j;
//			}
//			System.out.println("3의 배수이고 9의 배수는 아닌 합: " + sum);
//		}
//			//1~100까지 정수 중에서 3의 배수이거나, 5의 배수인 수의 합
//		sum = 0;
//		for (int i = 1; i < 101; i++) {
//			if (i % 3 == 0 || i % 5 == 0) {
//				sum = sum+i;
//			}
//			System.out.println("3의 배수이거나, 5의 배수인 수의 합 : " + sum);
//		}
		//System.out.println();
		
//		for (int i = 1; i <=5; i++) {
//			System.out.print("*");
//		}
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
