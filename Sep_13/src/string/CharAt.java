package string;

public class CharAt {

	public static void main(String[] args) {
		String str1 = "�ڹ� ���α׷���";
		String str2 = "Hello java";
		char ch = str1.charAt(3);
		System.out.println(ch);
		System.out.println();
		
		//str1 '��'��� ���ڰ� �ִ���
		//�����ϰ� ����, ����

		boolean flag = false;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == '��') {
				flag = true;
				break;
			}
		}
		System.out.println(flag? "�����ϰ� ����" : "�����ϰ� ���� ����");
		
		System.out.println();
		
		
		
		//str2�� char �迭�� ��� �� �迭�� ���
		char chr[] = new char[str2.length()];
		
		for (int i = 0; i < str2.length(); i++) {
			chr[i] = str2.charAt(i);
		}
		
		for (char c : chr) {
			System.out.printf("%c", c);
			
		}
		
		
	}

}
