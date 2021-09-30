package test;

public class SwitchMain {
	public static void main(String[] args) {
		// 주사위 1~6사이의 수를 자동으로 생성
		// switch(int, double, float, String, enum) {
		// case 값1 :
		// 해야할 일;
		// break;
		// case 값2;
		// 해야할 일
		// break;
		// default:
		// 해야할 일;
		//
		// }
		// if ~ else if ~else 대체 사용 가능 (보통 else if를 사용할 때 대신해 switch를 많이 씀)
		// Math.rnadom
		// 0.0<= 어떤값 <1.0
		int num = (int) (Math.random() * 6) + 1;

		System.out.println(num);
//		if (num == 1) {
//			System.out.println("1번 나옴");
//		} else if (num == 2) {
//			System.out.println("2번 나옴");
//		} else if (num == 3) {
//			System.out.println("3번 나옴");
//		} else if (num == 4) {
//			System.out.println("4번 나옴");
//		} else if (num == 5) {
//			System.out.println("5번 나옴");
//		} else
//			System.out.println("6번 나옴");
		
		// switch
		
		switch (num) {
		case 1:
			System.out.println("1번 나옴");
			break;
		case 2:
			System.out.println("2번 나옴");
			break;
		case 3:
			System.out.println("3번 나옴");
			break;
		case 4:
			System.out.println("4번 나옴");
			break;
		case 5:
			System.out.println("5번 나옴");
			break;
		default:
			System.out.println("6번 나옴");
		}
		
	}

}
