package Exception;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account();
		
		try {
			account.withdraw(100000);
		} catch (Exception e) {
			
			e.printStackTrace();//������ ��� ������ �����ؼ� �������
		}
		//try ������ �ܵ����� �� �� ����
		// finally���� catch�� ������Ѵ�.
//		try {
//			
//		}finally {
//			
//		}
//		try {
//			
//		}catch(Exception) {
//			
//		}
	}

}
