package inheritance;

public class BounsPointAccount extends AccountMain2 {
//���¹�ȣ, ������, �ܾ�, ���ʽ�����Ʈ / �Ա��ϴ�, ����ϴ�, ���ʽ� ����Ʈ �߰�
	private int bonusPoint;
	
	
	
	public BounsPointAccount(String acNum, int x, String name, int bonusPoint) {
		super(acNum, x, name);
		this.bonusPoint = bonusPoint;
	}
	
	//�Ա��ϴ�
	@Override
		void addAcount(int amount) {
			// �����ϴ� : ���ݾ��� 0.1%�� ���ʽ� ����Ʈ
//		setX(getX()+amount);	
		
		super.addAcount(amount);
		//���ʽ� ����Ʈ += ���ݾ��� 0.1%���ʽ� ����Ʈ
		bounsPoint += amount+0.01;
		
			
		}
	getBounusPoint
	
	
	
	
	
}
