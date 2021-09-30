

public class ForTest7Main {
	public static void main(String[] args) {


		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= 1; j--) {
				System.out.print(j<=i ? "*" : "");
//				if(j <= i) {
//					System.out.print("*");
//				}eles {
//					System.out.print("");
//				}
			}
			System.out.println();
		}  
		
	}
}
