package array;

public class ArrayTest1Main {

	public static void main(String[] args) {
		// int Ÿ���� ���� 10�� ����
//		int a = 
//				int b = 
//				int c = 
//				int d = 
//				int e = .............
		// �迭 (����Ÿ��)
		// ����Ÿ�� : ��/null/�ڵ����� �ʱ�ȭ
		// ������ 0
		// �Ǽ� 0.0
		// boolean false
		int arr[] = new int[10];// 0~9���� �� ����

		// ���� ��ҿ� ���� �ϰ� �ʹٸ�
		// �� ��ȣ�� ������ �ִ�(0������ ����) = index ��ȣ
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
