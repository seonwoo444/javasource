import java.util.Scanner;

public class ForTest4 {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		System.out.print("´Ü¼ö : ");
		int num1 = k.nextInt();
		
		for (int i = 1; i < 10; i++) {
			//System.out.println("2*"+i+"="+(2*i));
			
			System.out.printf("%d * % d = %d\t",num1, i, (num1*i));
		}

	}

}
