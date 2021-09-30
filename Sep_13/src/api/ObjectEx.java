package api;

import com.sun.jdi.Value;

public class ObjectEx {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		//equals(주소비교) => false
		System.out.println(obj1.equals(obj2));
		
		//String 사용하는 equals는 오버라이딩 적용
		String str1 = "홍길동";
		String str2 = "홍길동";
		System.out.println(str1.equals(str2));
		
		value value1 = new value(10);
		value value2 = new value(10);
		//equals(주소비교) => 당연히 false 값을 비교하는 것이 아닌 주소를 비교
		System.out.println(value1.equals(value2));
		
	}
}
