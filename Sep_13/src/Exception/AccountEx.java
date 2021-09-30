package Exception;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account();
		
		try {
			account.withdraw(100000);
		} catch (Exception e) {
			
			e.printStackTrace();//오류가 어디서 났는지 추적해서 출력해줌
		}
		//try 구문만 단독으로 올 수 없음
		// finally던지 catch가 와줘야한다.
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
