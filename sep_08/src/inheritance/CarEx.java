package inheritance;

public class CarEx {
	public static void main(String[] args) {
		FireEngine f;
		Ambulance a;
		
//		f = a;//상속관계가 아닌 클래스끼리 대입이 불가능(형변환 불가)
		
		f= new FireEngine();
		
		Car car = f; // 상속관계가 있는 상황 형변환 가능 upcasting(형변환 스킵 가능)
		
		FireEngine f2;
		f2 = (FireEngine) car; // downcasting(형변환 생략 불가능)
		
		
		f2.water();		
	}
}
