
public class GoodsStockMain2 {
	// 속성 : 상품코드(p12345), 재고수량(100)
	// 기능 : 재고수량 증가(입력값 수량, 출력값은 없음) / 감소(입력값 수량, 출력값은 현재 재고수량)
	
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
	// 현재 재고수량을 리턴하는 기능
	
	int getStockNum() {
		return num1;
	}
	
}
