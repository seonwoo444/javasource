package classTest;

public class SubscriberInfoEx {
	public static void main(String[] args) {
		SubscriberInfo info1 = new SubscriberInfo("ȫ�浿", "hong123", "hong1234");
		SubscriberInfo info2 = new SubscriberInfo("������", "sung123", "sung1234","010-1234-1234","����� ���α�");
		
		
		//ȫ�浿 ��ȭ��ȣ �߰�
		info1.setTel("010-4321-4321");
		
		
		//������ �ּ� ����
		info2.setAddress("����� ������");

	}

}