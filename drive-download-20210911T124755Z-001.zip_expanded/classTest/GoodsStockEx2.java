package classTest;

public class GoodsStockEx2 {
	public static void main(String[] args) {

		
		//ù��° ��ǰ ������
		GoodsStock2 product1 = new GoodsStock2("p12345",30);
		
		//Ŭ���� �ܺο��� �Ӽ��� ���� �����ϴ� ���� �ȵ�
		//private => GoodsStock2.code is not visible
		//product1.code = "p12345";
		//product1.stockNum = 30;
		
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
		System.out.println("���� ������ "+product1.getStockNum());
		
		
		

	}
}
