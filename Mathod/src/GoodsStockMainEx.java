
public class GoodsStockMainEx {
	public static void main(String[] args) {
		
		GoodsStockMain1 obj = new GoodsStockMain1();
		
		//Ŭ���� �ܺο��� �Ӽ��� ���� �����ϴ� ���� �ȵ�.
		obj.code = "p12345";
		obj.num1 = 40;
		
		//��� ����
		// ȣ�� => ���ϰ��� �ִٸ� ���ϰ��� �ޱ�(syso, ����)
		//syso ��� ���
//		System.out.println("���� ������� "+obj.minNum(15));
		//��¸� �� �Ŷ�� ���� ���
		//���� ���
		int stockNum = obj.minNum(15);
		//���ķ� stockNum�� ��� ���� �ִ�.
		System.out.println("���� ������� "+stockNum);
		
		//��� ����
		obj.addNum(5);
		//void�Ͻ� �޼ҵ� ȣ�� => return Ÿ���� ���ٸ� ȣ�⸸ �ϸ� ��
		//ȣ�⸸ ���� => syso, �����޾Ƽ� ��� �Ұ�
		System.out.println("���� ������� "+obj.num1);
		
	}
}