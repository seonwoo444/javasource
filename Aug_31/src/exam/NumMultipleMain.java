package exam;

public class NumMultipleMain {

	public static void main(String[] args) {
		// 변수 num의 값보다 크면서 가장 가까운 10의 배수에서 변수 num의 값을 뺀 나머지를 구하시오
		// ex) num이 24라면 크면서도 가장 가까운 10의 배수는 30임

		int num = 24;

//		int a = (90 - num) * 10;
//		System.out.println(a);
//		System.out.println((10-(num%10))*10);
		System.out.println((num/10+1)*10);
	}

}
