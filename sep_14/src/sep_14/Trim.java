package sep_14;

public class Trim {

	public static void main(String[] args) {
		// ���ڿ� ��, ��  ���� �����ֱ�
		String str1 ="    abc    ";
		String str2 = "abc";
		
		String newStr1 = str1.trim();
		
		System.out.println(str1.equals(str2));
		System.out.println(str1);
		System.out.println(newStr1);
		System.out.println(newStr1.equals(str2));

	}

}
