
public class Exam3Main {

	public static void main(String[] args) {
		// 1+2+3+4+5+6+7+8+9+10=55

		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum = sum + i;
			System.out.print(i);
			if (i < 10) {
				System.out.print("+");
			}else {
				System.out.print("=");
				System.out.print(sum);
			}
//			if (i >= 10) {
//				System.out.print("=");
//			}
		}
	}

}
