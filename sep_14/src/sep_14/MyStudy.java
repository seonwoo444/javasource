package sep_14;

public class MyStudy {
	public static void main(String[] args) {
		int[] scores = { 23, 54, 23, 31, 45 };

		int sum = 0;
		for (int score : scores) {
			sum = sum + score;
			System.out.println(sum);
		}
	}
}
