package sep_14;

public class Case {

	public static void main(String[] args) {
		//대소문자 변경
		
		String str1 = "Java programing";
		String str2 = "Java Programing";
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.equalsIgnoreCase(str2));//대소문자 구별하지 말고 같은지 비교해줘

		System.out.println(str1.toUpperCase());//모두 대문자로
		
		System.out.println(str1);//변경된 값이 아닌 원래 값이 도출 => 변경값으로 하고 싶다면 새로 담아라
		System.out.println(str2.toLowerCase());//모두 소문자로
	}

}
