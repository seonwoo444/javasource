package inheritance;

public class CreditLineAccount extends AccountMain2 {
//���¹�ȣ, ������, �ܾ�, ���̳ʽ��ѵ� / �Ա��ϴ�, ����ϴ�
	
	private int creditLine; //���̳ʽ� �ѵ�
	
	public CreditLineAccount(String accountNo, int x, String name, int creditLine) {
		super(accountNo, x, name);
		this.creditLine = creditLine;
	}
	   
	
	//����ϴ� �������̵�
	//�θ��� ��� : ����ϴ� = �ܾ� - ��ݾ�
	//�ڽ��� ��� : ����ϴ� = �ܾ�(�����ܾ� + ���̳ʽ� �ѵ�) - ��ݾ�
	@Override
		int subAccount(int amount) {
		if (getX()+creditLine<amount) {
			System.out.println("����Ұ�");
			return 0;
		}
		setX(getX()-amount);

			return getX();
		}
	
	
	
	
	
	
	
}
