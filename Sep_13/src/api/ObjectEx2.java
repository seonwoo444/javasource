package api;

import com.sun.jdi.Value;

public class ObjectEx2 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		//toString => ��ü�� ���ڿ��� ǥ��
		System.out.println(obj1.toString());//java.lang.Object@123a439b
		System.out.println(obj2.toString());//java.lang.Object@7de26db8
		
		//String ����ϴ� toString �������̵� ���� = > ��ü�� �����ִ� ���� ����ϵ��� �������̵� ��
		String str1 = "ȫ�浿";
		String str2 = "ȫ�浿";
		System.out.println(str1.toString());
		System.out.println(str2.toString());
		
		value value1 = new value(10);
		value value2 = new value(10);
		//toString => 10 ���� ��� �������̵�
		System.out.println(value1.toString());//api.value@36aa7bc2
		System.out.println(value2.toString());//api.value@76ccd017
		// toString ������ �������̵� �Ѵ�
	}
}
