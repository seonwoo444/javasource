import java.util.Scanner;

public class OperatorMain {
	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);
		
		System.out.print("x : ");
		
		int xx = k.nextInt();
		
		System.out.print("y : ");
		
		int yy = k.nextInt();
		
		System.out.println("--------------");
		System.out.printf("x는 %d, y는 %d\n", xx, yy);
		
		// 연산자
		// = : 대입연산자, 우항에 있는거 왼쪽에 대입 - 모든 연산자중 가장 마지막에 발동
		//산술연산자
		// + : 
		//			String + 숫자 => 붙여서 String으로
		// -
		// *
		// / : 
		//		int / int => 나눠서  int로 -> 원하는 나누기 계산법
		// 									둘 중에 하나라도 실수형이어야 실수형으로 값이 나온다
		//										double / double double / int
		// % : 나누고 남은 값
		int a = xx + yy;
		int b = xx - yy;
		int c = xx * yy;
		double d = xx / yy;
		int dd = xx / yy;
		double ddd = xx / (double) yy;
		int e = xx % yy;
		
		System.out.println(a);
		System.out.println("차는" + b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(dd);
		System.out.println(ddd);
		System.out.println(e);
		
		String laugh = "ㅋ";
		String aa = xx + laugh;
		System.out.println(aa);
		
		String bb = "차는" + b;
		System.out.println(bb);
		

		// 결합형연산자(산술연산자+대입연산자)
		// +=
		// -=
		// *=
		// /=
		// %=
		// xx += 5
		xx += 5;
		System.out.println(xx);
		
		yy -= 3;
		System.out.println(yy);
		
		xx *= 2;
		System.out.println(xx);
		
		yy /= 2;
		System.out.println(yy);
		
		xx %= 3;
		System.out.println(xx);
		System.out.println("-------");
//		xx = xx + 1;
//		xx += 1;
		xx++; //(하나만 올릴거면)
		System.out.println(xx);
		// 증감연산자
		// ++ : 하나 올리고
		// -- : 하나 내리고
		
		
		
		
		
	}
}
