package classTest;

public class GoodsStock {
	//�Ӽ� : ��ǰ�ڵ�(p12345), ������(100)
	String code;
	int stockNum; // 10
	
	//��� : ������ ����(�Է°� ����, ��°��� ����),
	void addStock(int amount) {
		stockNum += amount;
	}
	//       ������ ����(�Է°� ����,��°��� ���� ������)
	int subtrackStock(int amount) {
		if(stockNum > amount) {
			stockNum -= amount;
		}
		return stockNum;
	}	
}
