package exam;

import java.util.Scanner;

import classTest.Account3;

public class BankApplication {
	
	private static Account accountArray[]=new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------------------------");
			System.out.println("1.���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
			System.out.println("---------------------------------------------------------");
			System.out.print("���� > ");
			
			int selectNo = scanner.nextInt();
			if(selectNo == 1) {
				//���»��� �۾�
				createAccount();
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
	
	//���� ����
	private static void createAccount() {
		//�迭�� ��� �ִ��� Ȯ��
		
		//��� �ִٸ� ������� �Է°��� ������� ��ü ���� ��� �ִ� �迭�� ���
		//���¹�ȣ,������,�ܾ�
		System.out.print("���¹�ȣ : ");
		String ano = scanner.next();
		System.out.print("������ : ");
		String owner = scanner.next();
		System.out.print("�ܾ� : ");
		int balance = scanner.nextInt();
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, balance);
				System.out.println("���°� �����Ǿ����ϴ�.");
				break;
			}
		}
		
	}
	//���� ��� ����
	private static void accountList() {
		//accountArray�� ���� �ƴ� �κи� ���
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] != null) {
				System.out.printf("%s\t%s\t%d\n",accountArray[i].getAno(),
						accountArray[i].getOwner(),accountArray[i].getBalance());
				
			}
		}
		
	}
	//�����ϱ�
	private static void deposit() {
		//findAccount ȣ���ؼ� �̿�
		
		//�Ա��� ���¹�ȣ �Է¹ޱ�
		System.out.print("�Ա� ���� �Է� : ");
		String ano = scanner.next(); //122-12
		
		Account account=findAccount(ano);
		
		//�Ա��ϱ� ���
		if(account!=null) {
			System.out.print("�Աݾ� : ");
			int amount = scanner.nextInt();
			// �ܾ� = �ܾ� + �Աݾ�;
			// account.balance += amount;
			account.setBalance(account.getBalance()+amount);
		}else {
			System.out.println("�Աݰ��¸� Ȯ���� �ּ���");
		}
	}
	//����ϱ�
	private static void withdraw() {
		//findAccount ȣ���ؼ� �̿�		
		System.out.print("��� ���� �Է� : ");
		String ano = scanner.next(); //122-12
		
		Account account=findAccount(ano);
		
		//����ϱ� ���
		if(account!=null) {
			System.out.print("��ݾ� : ");
			int amount = scanner.nextInt();
			account.setBalance(account.getBalance()-amount);
		}else {
			System.out.println("��ݰ��¸� Ȯ���� �ּ���");
		}
	}
	//Account �迭���� ano�� ������ Account ��ü ã��
	private static Account findAccount(String ano) {
		// ano => 122-12
		
		Account account = null;
		// ano�� ������ Account ��ü ã��
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				//���� ano ��  accArr[i] �� ������ �ִ� ano�� ���ٸ�
				if(ano.equals(accountArray[i].getAno())) {
					account = accountArray[i];		
					break;
				}
			}
		}
		
		return account;
	}

}


















