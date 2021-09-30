
public class AccountMain2Ex2 {
	public static void main(String[] args) {
		AccountMain2 obj = new AccountMain2();
		
//		obj.AcNum = "1234-012-235673-32-4325";
//		obj.x = 25000;
//		obj.name = "이선우";
		
		//계좌번호
		obj.setAcNum("123-01-123441");
		// 이름
		obj.setName("이선우");
		//잔액
		obj.setX(10000);
		//입금
		obj.addAcount(50000);
		System.out.println(obj.getX()); 
		
		//출금
		System.out.println(obj.subAccount(30000));
		
		// 박보검 계좌
		AccountMain2 account1 = new AccountMain2("1234-01-123344", 1000000, "박보검");
		System.out.println("현재 잔액 : "+account1.getX());
		//이선우 계좌
		AccountMain2 account2 = new AccountMain2("1234-01-154543", "이선우");
		System.out.println("현재 잔액 조회 : "+account2.getX());
	}
}
