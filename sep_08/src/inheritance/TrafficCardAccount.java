package inheritance;
//Account2
//CheckingAccount
public class TrafficCardAccount extends CheckingAccount {

// CheckingAccount�� �� �����ִ� ��� ���¹�ȣ, ������, �ܾ�, ī���ȣ, ����ī�� ��ɿ���
// CheckingAccount�� �� �����ִ� ��� �Ա��Ѵ�, ����Ѵ�, üũī��
	private boolean hasTrafficCard;

public TrafficCardAccount(String acNum, int x, String name, String cardNo, boolean hasTrafficCard) {
		super(acNum, x, name, cardNo);
		this.hasTrafficCard = hasTrafficCard;
	}	
//����ī�� ����� �ִٸ� ����� ����
	//�Է°� : ī���ȣ, ����� ����
	//��ȯ�� : ����
	
int pay(String cardNo, int amount) {
	if (!hasTrafficCard) {
		System.out.println("����ī������ Ȯ�����ּ���");
		return 0;
	}
	
	return pay(cardNo, amount);

}
	
}
