
public class ForTest2 {
	public static void main(String[] args) {
		// 1~10까지의 합
		int sum = 0;
		for (int i = 1; i < 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

		System.out.println();

		// 1~100까지의 합
		sum = 0;
		for (int i = 1; i < 101; i++) {
			sum = sum + i;
		}
		System.out.println("1 ~ 100 까지의 합 :  "+sum);
	}
}
