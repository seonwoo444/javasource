package sep_14;

public class Case {

	public static void main(String[] args) {
		//��ҹ��� ����
		
		String str1 = "Java programing";
		String str2 = "Java Programing";
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.equalsIgnoreCase(str2));//��ҹ��� �������� ���� ������ ������

		System.out.println(str1.toUpperCase());//��� �빮�ڷ�
		
		System.out.println(str1);//����� ���� �ƴ� ���� ���� ���� => ���氪���� �ϰ� �ʹٸ� ���� ��ƶ�
		System.out.println(str2.toLowerCase());//��� �ҹ��ڷ�
	}

}
