package systemclass;

public class SystemEx1 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i+"\t");
			if (i==5) {
				System.exit(0);
			}
		}
//		System.arraycopy(args, 0, args, 0, 0);
		
	}
}
