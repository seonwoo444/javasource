
public class WhileTest2Main {
	private static int i;

	public static void main(String[] args) {
		
		int sum = 0;
		
		i = 1;
		while (i<101) {
			sum = sum+i;
			i++;
		}
		System.out.println();
		
		i = 1;
		while (i<10) {
			System.out.printf("2*%d=%d\t", i,(2*i));
			i++;
		}
		
	}
}
