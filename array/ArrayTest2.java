package array;

public class ArrayTest2 {
	public static void main(String[] args) {
		// int Ÿ���� ���� 10 �� ����
		// ���������ϴ�Ÿ�� �迭��[] = new ���������ϴ�Ÿ��[����]
		
		// �迭�� ����� ����(��)
		int scores[] = new int[10];
		
		int arr[]; //����		
		arr = new int[10]; //����
		
		
		// �迭�� ����� ���� �� �ʱ�ȭ
		int arr2[]= {35,95,65,75,25,33};
		System.out.println("�迭 ���� "+arr2.length);
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		
		
	}
}




