package classTest;

public class GoodsStockEx {
	public static void main(String[] args) {

		
		//ù��° ��ǰ ������
		GoodsStock product1 = new GoodsStock();
		product1.code = "p12345";
		product1.stockNum = 30;
		
		//��ǰ�Ǹ� => ��� ����
		//�޼ҵ� ȣ�� => ���ϰ��� �ִٸ� ���ϰ��� �ޱ�(syso, ����)
		//System.out.println("���� ������ "+product1.subtrackStock(15));
		
		//���� ����
		int stockNum = product1.subtrackStock(15);
		//���ķ� stockNum ����� �� �ִ�.
		System.out.println("���� ������ "+stockNum);
			
		
		//��ǰ => ��� ����
		//�޼ҵ� ȣ�� => ����Ÿ���� ������ ȣ�⸸ �ϸ� ��
		product1.addStock(5);
		System.out.println("���� ������ "+product1.stockNum);
		
		
		

	}
}
