package sep_14;

public class IndexOf {
	public static void main(String[] args) {
		String str1 = "�ڹ� ���α׷���";
		
		//�Ű������� �־��� ���ڿ��� ���۵Ǵ� ��ġ�� ����
		int index = str1.indexOf("���α׷���");
		System.out.println(index);
		
		System.out.println("��ã�� ���"+str1.indexOf("���̽�"));
		
		System.out.println();
		
		String str2 = "HelloHelloHello World";
		System.out.println(str2.indexOf(65));
		System.out.println(str2.indexOf('f'));
		System.out.println(str2.indexOf("el", 2));
		
		//�ڿ������� ã�Ƽ� �ڸ� ���� ������ش�
		System.out.println("l ã�� : "+str2.lastIndexOf("l"));

		//'��'�� ����ִ��� Ȯ��(indexOf)
		System.out.println(str1.indexOf('��') > -1? "�����ϰ� �ִ�" : "�����ϰ� ���� �ʴ�");
		
		
		
	}
}
