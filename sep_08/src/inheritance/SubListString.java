package inheritance;

public class SubListString extends ListString {
	String name = "������";
	
	@Override
	private void List() {
		super.List();//�θ��� List�� ȣ��
		System.out.println(name+"���� Ŭ����");

	}
	
	public void writer() {
		//�θ� ���� �ִ� �̸��� ���
		System.out.println(super.name);
		
		super.List();
	}
}
