
public class GoodsStockMain2 {
	// �Ӽ� : ��ǰ�ڵ�(p12345), ������(100)
	// ��� : ������ ����(�Է°� ����, ��°��� ����) / ����(�Է°� ����, ��°��� ���� ������)
	
	private String code;
	private int num1;
	
	GoodsStockMain2(){
		
	}
	
	GoodsStockMain2(String code, int num1){
		this.code = code;
		this.num1 = num1;
	}
	void addNum(int amount){
		num1 += amount;
	}
	int minNum(int amount){
		if (num1 > amount) {
			num1 -= amount;
		}  
		return num1;
	}
	// ���� �������� �����ϴ� ���
	
	int getStockNum() {
		return num1;
	}
	
}
