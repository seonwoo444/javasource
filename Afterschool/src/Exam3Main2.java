
public class Exam3Main2 {

	public static void main(String[] args) {
		// 1+2+3+4+5+6+7+8+9+10=55

		int sum = 0;
		int i = 0;
		while (i<10) {
			i++;
			sum = sum + i;
			System.out.print(i);
			if(i<=9) {
				System.out.print("+");
			}
//				else {
//				System.out.print("=");
//				System.out.print(sum);
			}
		}
		

	
	
	
	}
	

}

//		for (int i = 1; i < 11; i++) {
//			System.out.print(i);
//			if (i < 10) {
//				System.out.print("+");
//			}else {
//				System.out.print("=");
//				System.out.print(sum);
//			}
////			if (i >= 10) {
////				System.out.print("=");
////			}
//		}