package test;

import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		//String position = "과장";
		// position 부장 700, 과장 500, 나머지 300
		Scanner k = new Scanner(System.in);
		System.out.print("직급 : ");
		
		String position = k.next();
		
		switch (position) {
		case "부장":
			System.out.println("700");
			break;
		case "과장":
			System.out.println("500");
			break;
		default:
		System.out.println("300");
			break;
		}
	}

}
