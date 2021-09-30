package stringtokenizer;

public class StringBuilderTest {

	public static void main(String[] args) {
//		String data = "ABC";
//		data += "DEF";
		//String 원본 문자열은 변경이 불가
		//기존걸 파괴하고 새롭게 문자열 생성
		// => StringBuilder, StringBuffer를 사용
		
		
		//멀티스레드 지원
//		StringBuffer buffer = new StringBuffer();
		
		//단일 스레드 지원
		StringBuilder builder = new StringBuilder();
		
//		추가
		//문자열을 파괴하고 만드는 것이 아닌 문자열 뒤에 덧붙여서 이어지게
		builder.append("ABC");
		builder.append("DEF");
		System.out.println(builder);
		
		//사입
		builder.insert(3, "34");
		System.out.println(builder);
		
		//String엔 append, insert가 없음
		
		//삭제
		builder.delete(1, 3);
		System.out.println(builder);
		
		String str1 = "JAVA Progrming";
		StringBuilder builder1 = new StringBuilder();
		
//		builder1.append(false)
//		
//		builder1.delete(0, 0)
		
		
		
		
		
		
		

	}

}
