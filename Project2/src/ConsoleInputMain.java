import java.util.Scanner;

// alt 왼 오 : 만든 파일 변경
public class ConsoleInputMain {
	public static void main(String[] args) {
		// 키보드 입력받을 준비
		Scanner k = new Scanner(System.in);

		// 식당 이름 입력받기
		System.out.print("식당 이름 : ");

		// 콘솔에 입력한 정보를 name에 저장
		String restor = k.next();

		System.out.print("식당 크기 : ");

		double size = k.nextDouble(); // -> int aa = k.nextint...등등 스트링만 예외

		// 테이블 수

		System.out.print("테이블 수 : ");
		int table = k.nextInt();

		// 영업중

		System.out.print("영업중 : ");
		boolean open = k.nextBoolean();
		
		k.close();
		
		System.out.println("*********");
		System.out.println(restor);
		System.out.println(size);
		System.out.println(table);
		System.out.println(open);
		System.out.println("*********");

	}
}
