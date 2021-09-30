
public class WhileTest1Main {
	public static void main(String[] args) {
		//
		int i=0;
		while (i<10) {
			//반복해야 할 작업
			System.out.println("안녕하세요");
			i++;
		}
		System.out.println();
		
		i=1;
		while (i<11) {
			System.out.print(i+"\t");
			i++;
		}
		System.out.println();
		i=0;
		while (i<11) {
			System.out.print(i+"\t");
			i+=2;
		}
		System.out.println();
		i=3;
		while (i<100) {
			System.out.print(i+"\t");
			i+=3;
		}
		
	}
}
