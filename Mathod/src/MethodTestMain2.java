
public class MethodTestMain2 {
	public static void main(String[] args) {
		MathodTestMain1 obj = new MathodTestMain1();
		obj.print99dan();
		
		//���� ���
		//�޼ҵ带 ȣ���ϴ� �ʿ��� �Է°��� �־��ֱ�
		obj.sum(4, 34);
//		obj.sum(10.5, 32.4); - ���������θ� ������ �Ѵ� �����θ� �ްڴٰ� ����������
//		obj.sum(4, 34);
		
		//�ڵ�����ȯ���� byte���� int�� �Ѿ�°� ������ ����.
		byte b1 = 3;
		byte b2 = 5;
		
		obj.sum(b1, b2);
	}
}
