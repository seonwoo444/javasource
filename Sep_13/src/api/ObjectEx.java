package api;

import com.sun.jdi.Value;

public class ObjectEx {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		//equals(�ּҺ�) => false
		System.out.println(obj1.equals(obj2));
		
		//String ����ϴ� equals�� �������̵� ����
		String str1 = "ȫ�浿";
		String str2 = "ȫ�浿";
		System.out.println(str1.equals(str2));
		
		value value1 = new value(10);
		value value2 = new value(10);
		//equals(�ּҺ�) => �翬�� false ���� ���ϴ� ���� �ƴ� �ּҸ� ��
		System.out.println(value1.equals(value2));
		
	}
}
