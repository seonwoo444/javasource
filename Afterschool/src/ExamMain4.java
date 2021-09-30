import java.util.Scanner;

public class ExamMain4 {
	public static void main(String[] args) {
			//정수를 입력하고 마지막에 0을 입력하세요
		// 10 30 -20 40 0
		// 입력한 수의 개수는 4개이며 평균은 15.0입니다.
		
		Scanner k = new Scanner(System.in);
		System.out.println("정수를.........");
		
		int num;
		int count = 0;
		int sum = 0;
		
		while ((num = k.nextInt())!=0) {
			sum += num;
			count++;
		}
		
		
		System.out.printf("입력한 수의 개수는 %d개이며 평균은 %.1f입니다.",count,(double)sum/count);
//		System.out.println("입력한 수의 개수는"+count+"개이며 평균은"+sum/count+"입니다.");
		
	}
}
