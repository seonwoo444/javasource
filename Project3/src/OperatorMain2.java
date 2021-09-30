import java.util.Scanner;

public class OperatorMain2 {
	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);

		System.out.print("키 : ");

		double height = k.nextDouble();

		System.out.print("나이 : ");
		
		int age = k.nextInt();
		System.out.println("----------");

		System.out.printf("키 %.1fcm, 나이 %d살\n", height, age);

		// > (초과), >=(이상), ==(같다-equer), !=(다르다), <= , <
		// 키가 150을 넘나
		boolean a = height > 150;
		System.out.println(a);

		// 나이가 10살 이하
		boolean b = (age <= 10); // () - 우선시 되는 연산에 써도 되고 안써도 된다.
		System.out.println(b);

		// 논리결합연산자 :  ~고, and... -> &&
		// 				~거나, or... -> ||
		//				반대, / not -> !
		
		// 나이가 5살 이상이고, 키가 200cm 이상인가
		boolean c = (age >= 5) && (height >= 200);
		System.out.println(c);
		// 키가 200cm 이상이거나, 나이가 5살 이상인가
		boolean d = (height >= 200) || (age >= 5);
		System.out.println(d);
		
		// d가 true면 e는 false
		// d가 false면 e는 true
		boolean e = !d;
		System.out.println(e);
				
	}
}
