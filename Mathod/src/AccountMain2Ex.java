
public class AccountMain2Ex {
	public static void main(String[] args) {
		AccountMain obj = new AccountMain();
		
		obj.AcNum = "1234-012-235673-32-4325";
		obj.x = 25000;
		obj.name = "�̼���";
		
		//�Ա�
		obj.addAcount(50000);
		System.out.println(obj.x);
		
		//���
		System.out.println(obj.subAccount(30000));
		
	}
}
