package test;

public class TypeTest1Main {
	public static void main(String[] args) {
		// Ÿ�� -1 ) �⺻Ÿ��
		// Ÿ��-2 ) ���� Ÿ��
		//������ �޸� ���Ǵ� ����� �޶���
		
		// �⺻Ÿ��
		int age = 25;
		double price = 200.4;
		
		// ����Ÿ��(Heap�� �ּҰ� �پ ����)
		// ����Ÿ�Ը� null�� �ʱ�ȭ�� ����
		String name = "java";
		String name2 = new String("java");
		String hobby = null; // ���� �� ������ �Ҵ���� ���� ��
		
		//�� ��
		// steak : == , !=
		// heap : .equals()�� Ȯ��
		
		System.out.println(name == name2 ? "����" : "�ٸ�");
		System.out.println(name.equals(name2) ? "����" : "�ٸ�");
		
		System.out.println(hobby);
		System.out.println(hobby.length());// .length : hobby��� �׸��� heap������ ���� �Ǿ������� ���빰�� ���� �˾ƺ��� 
		
		
		
	}
}
