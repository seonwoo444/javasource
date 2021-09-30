//continue; 반복문안에서 사용되며, 블록 내에서 continue 문이 실행되면 for문의 증감식, while 조건식으로 이동
public class CountinueTestMain1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i %2 == 0) {
				continue; // 실행 결정 부분
			}// 조건에 만족하면 syso을 안하고 for문으로 돌아가 다시 실해
			// 불만족 시 출력
			System.out.println(i);
		}

	}

}
