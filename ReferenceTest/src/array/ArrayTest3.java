package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		// int Ÿ���� �迭 5�� ����
		// 0 10 20 30 40
		int score[] = {0, 10, 20, 30, 40};
		
		for (int i : score) {
			System.out.print(i+"\t");
		}
//		for (int i = 0; i < score.length; i++) {
//			System.out.print(score[i]+"\t");
//		}
		System.out.println();
		//String Ÿ���� �迭 5�� ����
		// ���� �̸� �ʱ�ȭ
		
		String a[] = {"���", "�ٳ���", "Ű��", "����", "����"};
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]+"\t");
//		}
		//���� for�� = �ϳ��� �������⸸ �ϱ⸦ ���ϸ� (�ƴҶ� for (int i = 0; i < a.length; i++) {System.out.print(a[i]+"\t");})
		for (String f : a) {
			System.out.print(f+"\t");
		}
		
	}

}
