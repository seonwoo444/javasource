package classTest;

// final : �����Ұ� / �ʱ�ȭ ������ �ʿ�
// ���Ǵ� �� : Ŭ����,�޼���,�������,��������
// Ŭ���� : ��� �Ұ�
// �޼ҵ� : �������̵� �Ұ�
// �������, �������� : ���� �Ұ�


public class Person {
	final String nation = "Korea";
	final String ssn; //The blank final field ssn may not have been initialized
	String name;
	
	public Person(String ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}	
	
	
}
