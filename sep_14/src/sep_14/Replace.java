package sep_14;


//String => immutable

public class Replace {

	public static void main(String[] args) {
		String str1 = "�ڹٴ� ��ü���� ����Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�";
		
		// �ѱ��� �����
//		str1 = str1.replace("�ڹ�", "java");//������ �� ��ü �ٽ� ����ִ� �� ��������� �Ѵ�.
		//��Ʈ���� �Һ��̶� ���� ��ü�� �ٲٴ� ���� �Ұ�
		
		str1 = str1.replaceFirst("�ڹ�", "java");
		
		System.out.println(str1);

	}

}
