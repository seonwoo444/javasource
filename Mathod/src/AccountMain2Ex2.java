
public class AccountMain2Ex2 {
	public static void main(String[] args) {
		AccountMain2 obj = new AccountMain2();
		
//		obj.AcNum = "1234-012-235673-32-4325";
//		obj.x = 25000;
//		obj.name = "�̼���";
		
		//���¹�ȣ
		obj.setAcNum("123-01-123441");
		// �̸�
		obj.setName("�̼���");
		//�ܾ�
		obj.setX(10000);
		//�Ա�
		obj.addAcount(50000);
		System.out.println(obj.getX()); 
		
		//���
		System.out.println(obj.subAccount(30000));
		
		// �ں��� ����
		AccountMain2 account1 = new AccountMain2("1234-01-123344", 1000000, "�ں���");
		System.out.println("���� �ܾ� : "+account1.getX());
		//�̼��� ����
		AccountMain2 account2 = new AccountMain2("1234-01-154543", "�̼���");
		System.out.println("���� �ܾ� ��ȸ : "+account2.getX());
	}
}
