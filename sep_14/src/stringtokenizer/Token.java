package stringtokenizer;

import java.util.StringTokenizer;

public class Token {
	public static void main(String[] args) {
		String text = "홍길동/성춘향/박연수/이수홍";
		
		String[] name = text.split("/");
		for(String s : name) {
			System.out.println(s);
			
		}
		
		System.out.println();
		
		String text1 = "홍길동 성춘향 박연수 이수홍";
		name = text1.split("");
		for (String str : name) {
			System.out.println(str);
		}
		
		System.out.println();
		
		//String을 나눠서 토큰으로 갖고있겠다
		StringTokenizer st = new StringTokenizer(text, "/");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			
		}
		
		
		
		
		
		
		
		
	}
}
