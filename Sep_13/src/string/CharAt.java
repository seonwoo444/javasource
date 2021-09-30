package string;

public class CharAt {

	public static void main(String[] args) {
		String str1 = "자바 프로그래밍";
		String str2 = "Hello java";
		char ch = str1.charAt(3);
		System.out.println(ch);
		System.out.println();
		
		//str1 '그'라는 문자가 있는지
		//포함하고 있음, 없음

		boolean flag = false;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == '그') {
				flag = true;
				break;
			}
		}
		System.out.println(flag? "포함하고 있음" : "포함하고 있지 않음");
		
		System.out.println();
		
		
		
		//str2를 char 배열로 담고 그 배열을 출력
		char chr[] = new char[str2.length()];
		
		for (int i = 0; i < str2.length(); i++) {
			chr[i] = str2.charAt(i);
		}
		
		for (char c : chr) {
			System.out.printf("%c", c);
			
		}
		
		
	}

}
