package arrays;

import java.util.Arrays;

public class ArraysEx3 {

	public static void main(String[] args) {
		int arr3[] = { 12, 54, 77, 58, 34, 87, 123, 68, 45 };

		// 58 ���ڰ� ���°�� �ִ��� ��ȸ
		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i] == 58) {

				System.out.println(i + 1 + "��° ã����");
				break;
			}
		}
		System.out.println();

		// binartSearch : �����˻�(������ ���� �� ��)
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		int pos = Arrays.binarySearch(arr3, 58);
		System.out.println(pos + 1 + "��° ã����");

	}

}
