package array;

public class ArrayTest1Main {

	public static void main(String[] args) {
		// int 타입의 변수 10개 생성
//		int a = 
//				int b = 
//				int c = 
//				int d = 
//				int e = .............
		// 배열 (참조타입)
		// 참조타입 : 힙/null/자동으로 초기화
		// 정수는 0
		// 실수 0.0
		// boolean false
		int arr[] = new int[10];// 0~9까지 방 생성

		// 개별 요소에 접근 하고 싶다면
		// 방 번호가 정해져 있다(0번부터 시작) = index 번호
		arr[3] = 43;
		arr[2] = 56;
		arr[6] = 32;
		arr[1] = 9;
		arr[4] = 78;
		arr[5] = 67;
		arr[7] = 6;
		arr[8] = 4;
		arr[9] = 23;
		System.out.println(arr[3]);
		System.out.println(arr[2]);
		System.out.println(arr[6]);
		System.out.println(arr[9]);
		
		for (int i = 0; i < 10; i++) {
			System.out.println(arr[i]);
			
		}

		
		

	}

}
