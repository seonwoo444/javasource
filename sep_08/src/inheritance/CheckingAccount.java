package inheritance;

public class CheckingAccount extends AccountMain2 {
	// ���¹�ȣ, ������, �ܾ� = > �θ� �����ִ�
	// �Ա��Ѵ�, ����Ѵ� => �θ�
	// ī���ȣ(111-11-1111)
	private String cardNo;

	public CheckingAccount(String acNum, int x, String name, String cardNo) {
		super(acNum, x, name);
		this.cardNo = cardNo;
		// TODO Auto-generated constructor stub
	}

	// �Է°� : ī���ȣ, ���ݾ�
	// ��ȯ�� : ���� int
	// ī�尪�� �����Ѵ� = �Ѿ�� ī���ȣ�� ���� �߱޵� ī���ȣ�� ������
	// ���ݾ� ���� �ܾ׺��� ������ Ȯ���� ��
	int pay(String cardNo, int amount) {
		if (!cardNo.equals(this.cardNo) || getX() < amount) {
			System.out.println("ī���ȣ�� ���ݾ��� Ȯ���� �ּ���");
			return 0;
		}
		// �ܾ� = ���� �ܾ� - ī�����
//		setX(getX()-amount);
		// �θ��� withdraw�� ������ ��ɰ� ����
		// �ٽ� ������ ���� �θ��� withdraw�� ����ϸ� ��
		return subAccount(amount);

	}
	
	

}
