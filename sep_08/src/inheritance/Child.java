package inheritance;

//extends(Ȯ�忡 ������ ���ִ�) �θ�Ŭ������(Parent) �ڽ� Ŭ�������� �θ�Ŭ���� ���� �Ҷ�
//�����޴� �� : �����ڿ� �ʱ�ȭ �ҷ��� ��ӵ��� ����
//private ��������� ������ ���� ��
//-���� �� �ܿ� �� �����޴´�-
//object -> parent -> child ������ �����

public class Child extends Parent {

	public Child(int age) {
		super(age);// parent�� int�� �޴� �����ڸ� ȣ��
	}
	
	
//	public Chind() {
//		super();// parent �� �⺻������ ȣ��
//	}
	
	void play() {
		System.out.println("����");
	}
	
	@Override
	public void print() {
		System.out.println("Hello");
		super.print();
	}
	
}
