package stringtokenizer;

public class StringBuilderTest {

	public static void main(String[] args) {
//		String data = "ABC";
//		data += "DEF";
		//String ���� ���ڿ��� ������ �Ұ�
		//������ �ı��ϰ� ���Ӱ� ���ڿ� ����
		// => StringBuilder, StringBuffer�� ���
		
		
		//��Ƽ������ ����
//		StringBuffer buffer = new StringBuffer();
		
		//���� ������ ����
		StringBuilder builder = new StringBuilder();
		
//		�߰�
		//���ڿ��� �ı��ϰ� ����� ���� �ƴ� ���ڿ� �ڿ� ���ٿ��� �̾�����
		builder.append("ABC");
		builder.append("DEF");
		System.out.println(builder);
		
		//����
		builder.insert(3, "34");
		System.out.println(builder);
		
		//String�� append, insert�� ����
		
		//����
		builder.delete(1, 3);
		System.out.println(builder);
		
		String str1 = "JAVA Progrming";
		StringBuilder builder1 = new StringBuilder();
		
//		builder1.append(false)
//		
//		builder1.delete(0, 0)
		
		
		
		
		
		
		

	}

}
