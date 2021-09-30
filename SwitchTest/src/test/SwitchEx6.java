package test;

import java.util.Scanner;

public class SwitchEx6 {

	public static void main(String[] args) {
		//(가위	1) 바위	2	보 3
		
		// 상대방 - 컴퓨터
		// 램덤 형태 1~3번이 자동으로 생성
		
		//본인이 제시하는 부분 - 입력(정수)
		//출력문 당신이 졌습니다 / 당신이 이겼습니다 / 비겼습니다.
		
		Scanner k = new Scanner(System.in);
		System.out.print("당신 : ");
		int you = k.nextInt();
		
		int comp = (int)(Math.random()*3)+1;
		System.out.printf("컴퓨터 : %d\n", comp);
		
		switch (you-comp) {
		case 2: case -1:
			System.out.println("당신이 졌습니다");
			break;
		case 1: case -2:
			System.out.println("당신이 이겼습니다");
			break;
		case 0:
			System.out.println("비겼습니다");
			break;
		}
		
	}

}
