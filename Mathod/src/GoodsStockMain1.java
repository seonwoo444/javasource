
public class GoodsStockMain1 {
	// �Ӽ� : ��ǰ�ڵ�(p12345), ������(100)
	// ��� : ������ ����(�Է°� ����, ��°��� ����) / ����(�Է°� ����, ��°��� ���� ������)
	
	 String code;
	 int num1;
	
	void addNum(int amount){
		num1 += amount;
	}
	int minNum(int amount){
		if (num1 > amount) {
			num1 -= amount;
		}  
		return num1;
	}
	
	
}
