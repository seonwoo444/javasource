package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		// int 타입의 배열 5개 생성
		// 0 10 20 30 40
		int score[] = {0, 10, 20, 30, 40};
		
		for (int i : score) {
			System.out.print(i+"\t");
		}
//		for (int i = 0; i < score.length; i++) {
//			System.out.print(score[i]+"\t");
//		}
		System.out.println();
		//String 타입의 배열 5개 생성
		// 과일 이름 초기화
		
		String a[] = {"사과", "바나나", "키위", "수박", "딸기"};
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]+"\t");
//		}
		//향상된 for문 = 하나씩 꺼내쓰기만 하기를 원하면 (아닐땐 for (int i = 0; i < a.length; i++) {System.out.print(a[i]+"\t");})
		for (String f : a) {
			System.out.print(f+"\t");
		}
		
	}

}
