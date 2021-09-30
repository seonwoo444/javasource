
public class GoodsStockMain1 {
	// 속성 : 상품코드(p12345), 재고수량(100)
	// 기능 : 재고수량 증가(입력값 수량, 출력값은 없음) / 감소(입력값 수량, 출력값은 현재 재고수량)
	
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
