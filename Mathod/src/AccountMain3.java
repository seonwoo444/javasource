

public class AccountMain3 {

	//�Ӽ� : ���¹�ȣ, �ܾ�, �̸�
	//��� : �Ա��Ѵ�(�Է°� : �Աݾ�, ��ȯ�� ����) => �����ܾ� += �Աݾ�
//			����Ѵ�(�Է°� : ��ݾ�, ��ȯ�� : �����ܾ�) => �����ܾ� -= ��E��

	// �⺻ ������
	
	private String acNum;
	private int x;
	private String name;
	
	//�⺻������
	// [���콺 ������] - [source] - [Generate Constructor using Fields..] => �Ϲ� ������ ���鶧
	// [���콺 ������] - [source] - [Generate Constructor using Super class..] => default ���鶧
	
	public AccountMain3() {
		super();
	}

	public AccountMain3(String acNum, int x, String name) {
		super();
		acNum = acNum;
		this.x = x;
		this.name = name;
//		this(acNum,name);
	}
	
	public AccountMain3(String acNum, String name) {
		super();
		acNum = acNum;
		this.name = name;
	}

	//�ܺηκ��� ���� �޾Ƽ� ��������� ���� �����ϴ� �۾���
	// set~���� �޼ҵ带 �ۼ��Ѵ�.
	
	//������� : ���¹�ȣ�� �����ϰ� �ʹٸ�
	public void setAcNum(String acNum) {
		this.acNum = acNum;
	}
	// �̸��� ����
	public void setName(String name) {
		this.name = name;
	}
	// �ܾ�
	public void setX(int x) {
		this.x = x;
	}
	
	// ��� ������ ���� �����ϰ� �ʹ�
	//get~���� ����
	public int getX() {
		return x;
	}
	public String getAcNum() {
		return acNum;
	}
	public String getName() {
		return name;
	}
	


	void addAcount(int amount) {
		x+=amount;
	}
	 
	 int subAccount(int amount) {
		 if (x > amount) {
			 x-=amount;			
		}
		 return x;
	 }
}
