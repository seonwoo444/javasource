
public class GoodsStockMainEx2 {
	public static void main(String[] args) {
		
		GoodsStockMain2 obj = new GoodsStockMain2("p12345",30);
		
		//클래스 외부에서 속성을 직접 변경하는 것은 안됨.
//		obj.code = "p12345";
//		obj.num1 = 40;
		
		//재고 감소
		// 호출 => 리턴값이 있다면 리턴값을 받기(syso, 변수)
		//syso 출력 방법
//		System.out.println("현재 재고수량 "+obj.minNum(15));
		//출력만 할 거라면 위에 방법
		//변수 방법
		int stockNum = obj.minNum(15);
		//이후로 stockNum을 계속 쓸수 있다.
		System.out.println("현재 재고수량 "+stockNum);
		
		//재고 증가
		obj.addNum(5);
		//void일시 메소드 호출 => return 타입이 없다면 호출만 하면 됨
		//호출만 가능 => syso, 변수받아서 출력 불가
		System.out.println("현재 재고수량 "+obj.getStockNum());
		
	}
}
