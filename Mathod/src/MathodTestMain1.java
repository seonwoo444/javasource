
public class MathodTestMain1 {

	// 두개의 숫자를 받아서 합을 보내주기
	// 정수형의 숫자
	int sum(int num1, int num2) {
//	 return 0;

		int result = num1 + num2;
		return result;// 출력값(반환값)
//		return num1 + num2; 위 와 같은 내용

	}

	// 구구단 2~9단을 출력하기
	// 보내지 않을 시 void로 생성
	void print99dan() {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
	}
	
	int muliply(int ) {
		return x * y;
	}
	
}