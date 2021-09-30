package sep_14;


//String => immutable

public class Replace {

	public static void main(String[] args) {
		String str1 = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 제공합니다";
		
		// 한글을 영어로
//		str1 = str1.replace("자바", "java");//변겅한 걸 객체 다시 담아주는 걸 선언해줘야 한다.
		//스트링은 불변이라 기존 자체를 바꾸는 것은 불가
		
		str1 = str1.replaceFirst("자바", "java");
		
		System.out.println(str1);

	}

}
