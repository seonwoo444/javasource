
public class AccountMain {

	//�Ӽ� : ���¹�ȣ, �ܾ�, �̸�
	//��� : �Ա��Ѵ�(�Է°� : �Աݾ�, ��ȯ�� ����) => �����ܾ� += �Աݾ�
//			����Ѵ�(�Է°� : ��ݾ�, ��ȯ�� : �����ܾ�) => �����ܾ� -= ��E��

	// �⺻ ������
	
	String AcNum;
	int x;
	String name;
	
	AccountMain(){}
	
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
