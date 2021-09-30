package api;

import com.sun.jdi.Value;

public class ObjectEx2 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		//toString => 객체를 문자열로 표현
		System.out.println(obj1.toString());//java.lang.Object@123a439b
		System.out.println(obj2.toString());//java.lang.Object@7de26db8
		
		//String 사용하는 toString 오버라이딩 적용 = > 객체가 갖고있는 값을 출력하도록 오버라이딩 함
		String str1 = "홍길동";
		String str2 = "홍길동";
		System.out.println(str1.toString());
		System.out.println(str2.toString());
		
		value value1 = new value(10);
		value value2 = new value(10);
		//toString => 10 값을 출력 오버라이딩
		System.out.println(value1.toString());//api.value@36aa7bc2
		System.out.println(value2.toString());//api.value@76ccd017
		// toString 무조건 오버라이딩 한다
	}
}
