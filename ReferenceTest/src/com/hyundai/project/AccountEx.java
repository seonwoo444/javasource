package com.hyundai.project;

import java.util.Scanner;

import com.samsung.project.Account;

public class AccountEx {

	
		// TODO Auto-generated method stub

		Account accountArray[] = new Account[100];// 맴버변수
		Scanner scanner = new Scanner(System.in);
		
		public static void main(String[] args) {
			boolean run = true;
			while(run) {
				System.out.println("--------------------------------------------");
				System.out.println("1.계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금| 5. 종료");
				System.out.println("--------------------------------------------");
				System.out.println("선택 > ");
				
				int selectNo = Scanner.nextInt();
				if(selectNo == 1) {
					//계좌생성
					creatAccount();
					
				}else if(selectNo == 2) {
					account 
				}else if(selectNo == 3) {
					
				}else if(selectNo == 4) {
					
				}else if(selectNo == 5) {
					
				}
				
			}
			System.out.println("프로그램 종료");
		
		
		
		
	}
	// 계좌 생성
	private static void creatAccount() {
		//배열에서 비어 있는지 확인 
		System.out.println("계좌번호 : ");
		String ano = scanner.next();
		System.out.println("계좌주 : ");
		String owner = scanner.next();
		System.out.println("잔액 : ");
		int balance = scanner.netInt();
		
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] = null) {
				accountArray[i] = new Account(ano, owner, balance);
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}
		
	}
	
	//예금하기
	private static void dposit() {
		//findAccount 호출해서 이용
	}
	
	// 출금하기
	private static void withdraw() {
		//findAccount 호출해서 이용
		
	}
	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		return null;
		
	}
}
