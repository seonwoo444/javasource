import java.util.Iterator;

public class AccountMain2Ex3 {
	public static void main(String[] args) {
		AccountMain3 account1 = new AccountMain3("122-12", 250000, "홍길동");
		AccountMain3 account2 = new AccountMain3("122-13", 260000, "이길동");
		AccountMain3 account3 = new AccountMain3("122-14", 270000, "최길동");
		AccountMain3 account4 = new AccountMain3("122-15", 280000, "박길동");
		AccountMain3 account5 = new AccountMain3("122-16", 290000, "김길동");

		// 동일한 타입으로 객체 생성시 효율성
		// 배열

		// arr[0] print = 0
		// double arr[] = new double[5]; arr[0] = 0.0
		// int a,b,c,d,e,...; = > int arr[] = new int[10];
		AccountMain3 accArr[] = new AccountMain3[5];
		// AccountMain3를 배열로 담을거다
		accArr[0] = new AccountMain3("122-12", 250000, "홍길동");
		accArr[1] = new AccountMain3("122-13", 260000, "이길동");
		accArr[2] = new AccountMain3("122-14", 270000, "최길동");
		accArr[3] = new AccountMain3("122-15", 280000, "박길동");
		accArr[4] = new AccountMain3("122-16", 290000, "김길동");

//		for (int i = 0; i < accArr.length; i++) {
//			System.out.println(accArr[i].getName() + "\t");
//			System.out.println(accArr[i].getAcNum() + "\t");
//			System.out.println(accArr[i].getX());

	}
	accountPrint(accArr);

		
//		System.out.println(accArr[0].getX()); // null
		System.out.println();

		for (int i = 0; i < accArr.length; i++) {
			AccountMain3 account = accArr[i];

//			// 입금
			account.addAcount(10000);
			accPrint(account);
//
//			System.out.println(accArr[i].getName() + "\t");
//			System.out.println(accArr[i].getAcNum() + "\t");
//			System.out.println(accArr[i].getX());

		}
	}

	static void accountPrint(AccountMain3 accArr[]) {
		for (int i = 0; i < accArr.length; i++) {
			System.out.println(accArr[i].getName() + "\t");
			System.out.println(accArr[i].getAcNum() + "\t");
			System.out.println(accArr[i].getX());
		}

	}
	static void accountPrint(AccountMain3 account) {
		
			System.out.println(account.getName() + "\t");
			System.out.println(account.getAcNum() + "\t");
			System.out.println(account.getX());
		}
}
