package test;

public class TypeTest1 {
	public static void main(String[] args) {
		// Ÿ�� - 1) �⺻Ÿ��  2) ����Ÿ��
		// ������ �޸� ���Ǵ� ����� �޶���
		
		// �⺻Ÿ��
		int age = 25;
		double price = 200.3;
		//int time = null;
		
		// ����Ÿ�� => Heap �� ���� / null �ʱ�ȭ /
		// ���ڿ� ���� : String name = new String("java")
		String name = "java";
		String name2 = new String("java");
		String hobby = null; //���� �� ������ �Ҵ���� ���� ��
		
		// �� ��  ==, !=
		//          equals()
		System.out.println(name == name2 ? "������" : "�ٸ�");
		System.out.println(name.equals(name2) ? "������" : "�ٸ�");
		
		
		System.out.println(hobby);
		// java.lang.NullPointerException
		System.out.println(hobby.length());
		
	}
}















