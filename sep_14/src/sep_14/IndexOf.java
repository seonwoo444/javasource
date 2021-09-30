package sep_14;

public class IndexOf {
	public static void main(String[] args) {
		String str1 = "자바 프로그래밍";
		
		//매개값으로 주어진 문자열이 시작되는 위치를 리턴
		int index = str1.indexOf("프로그래밍");
		System.out.println(index);
		
		System.out.println("못찾는 경우"+str1.indexOf("파이썬"));
		
		System.out.println();
		
		String str2 = "HelloHelloHello World";
		System.out.println(str2.indexOf(65));
		System.out.println(str2.indexOf('f'));
		System.out.println(str2.indexOf("el", 2));
		
		//뒤에서부터 찾아서 자리 값을 출력해준다
		System.out.println("l 찾기 : "+str2.lastIndexOf("l"));

		//'그'가 들어있는지 확인(indexOf)
		System.out.println(str1.indexOf('그') > -1? "포함하고 있다" : "포함하고 있지 않다");
		
		
		
	}
}
