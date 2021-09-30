package stringtokenizer;

import java.util.StringTokenizer;

public class Token {
	public static void main(String[] args) {
		String text = "ȫ�浿/������/�ڿ���/�̼�ȫ";
		
		String[] name = text.split("/");
		for(String s : name) {
			System.out.println(s);
			
		}
		
		System.out.println();
		
		String text1 = "ȫ�浿 ������ �ڿ��� �̼�ȫ";
		name = text1.split("");
		for (String str : name) {
			System.out.println(str);
		}
		
		System.out.println();
		
		//String�� ������ ��ū���� �����ְڴ�
		StringTokenizer st = new StringTokenizer(text, "/");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			
		}
		
		
		
		
		
		
		
		
	}
}
