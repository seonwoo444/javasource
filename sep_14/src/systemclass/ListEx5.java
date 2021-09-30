package systemclass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx5 {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList(2000000);
		List<String> linkedList = new LinkedList();

		System.out.println("******������ �߰�******");

		System.out.println("ArrayList �ɸ��ð� : " + add1(arrayList) + "ms");
		System.out.println("LinkedList �ɸ��ð� : " + add1(linkedList) + "ms");

		System.out.println();

		System.out.println("******�߰����� �߰�******");

		System.out.println("ArrayList �ɸ��ð� : " + add2(arrayList) + "ms");
		System.out.println("LinkedList �ɸ��ð� : " + add2(linkedList) + "ms");
		
		System.out.println();
		
		System.out.println("******�߰����� ����******");

		System.out.println("ArrayList �ɸ��ð� : " + remove1(arrayList) + "ms");
		System.out.println("LinkedList �ɸ��ð� : " + remove1(linkedList) + "ms");
		
		System.out.println();
		
		System.out.println("******���������� ����******");

		System.out.println("ArrayList �ɸ��ð� : " + remove2(arrayList) + "ms");
		System.out.println("LinkedList �ɸ��ð� : " + remove2(linkedList) + "ms");

	}

	// �������� �߰�
	public static long add1(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			list.add(i + "");
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	// �߰����� �߰�
	public static long add2(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			list.add(500 + "X");
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	// �߰����� ����
	public static long remove1(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	// ���������� ����
	public static long remove2(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = list.size() - 1; i >= 0; i--) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

}
