package classTest;

public class AccountEx3 {
	public static void main(String[] args) {
		// Account3 ��ü�� 5�� �����ϰ� �ʹ�
//		Account3 account1 = new Account3("122-12", 250000, "ȫ�浿");
//		Account3 account2 = new Account3("122-13", 260000, "��浿");
//		Account3 account3 = new Account3("122-14", 270000, "��浿");
//		Account3 account4 = new Account3("122-15", 280000, "�ֱ浿");
//		Account3 account5 = new Account3("122-16", 290000, "�̱浿");
//		
		//������ Ÿ������ ��ü ������ ȿ������ �����Ѵٸ�?
		
		//Ŭ���� �迭
		Account3 accArr[] = new Account3[5];
		//System.out.println(accArr[0]); // null		
		
		accArr[0] = new Account3("122-12", 250000, "ȫ�浿");
		accArr[1] = new Account3("122-13", 260000, "��浿");
		accArr[2] = new Account3("122-14", 270000, "��浿");
		accArr[3] = new Account3("122-15", 280000, "�ֱ浿");
		accArr[4] = new Account3("122-16", 290000, "�̱浿");
			
		
		// int a,b,c,d,e,.....; => int arr[]=new int[10];
		// double arr[]=new double[5]; arr[0] => 0.0
		// arr[0] print => 0
		
//		for(int i=0;i<accArr.length;i++) {
//			System.out.print(accArr[i].getName()+"\t");
//			System.out.print(accArr[i].getAccountNo()+"\t");			
//			System.out.println(accArr[i].getBalance());
//		}
		
		accountPrint(accArr);
		
		System.out.println();
		
		for(int i=0;i<accArr.length;i++) {
			
			Account3 account = accArr[i];
			
			//�Ա�
			account.deposit(10000);
			
			accountPrint(account);
			
//			System.out.print(account.getName()+"\t");
//			System.out.print(account.getAccountNo()+"\t");			
//			System.out.println(account.getBalance());
		}		
	}
	
	static void accountPrint(Account3 accArr[]) {
		for(int i=0;i<accArr.length;i++) {
			System.out.print(accArr[i].getName()+"\t");
			System.out.print(accArr[i].getAccountNo()+"\t");			
			System.out.println(accArr[i].getBalance());
		}
	}
	
	static void accountPrint(Account3 account) {
		System.out.print(account.getName()+"\t");
		System.out.print(account.getAccountNo()+"\t");			
		System.out.println(account.getBalance());
	}
	
}














