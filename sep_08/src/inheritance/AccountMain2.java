package inheritance;


public class AccountMain2 {

	
	private String AcNum;
	private int x;
	private String name;
	
	
//	public AccountMain2() {
//		super();
//	}

	public AccountMain2(String acNum, int x, String name) {
		super();
		AcNum = acNum;
		this.x = x;
		this.name = name;
	}
	
//	public AccountMain2(String acNum, String name) {
//		super();
//		AcNum = acNum;
//		this.name = name;
//	}

	//�ܺηκ��� ���� �޾Ƽ� ��������� ���� �����ϴ� �۾���
	// set~���� �޼ҵ带 �ۼ��Ѵ�.
	
	//������� : ���¹�ȣ�� �����ϰ� �ʹٸ�
	public void setAcNum(String acNum) {
		this.AcNum = acNum;
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
		return AcNum;
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
