package inheritance;

public class CarEx {
	public static void main(String[] args) {
		FireEngine f;
		Ambulance a;
		
//		f = a;//��Ӱ��谡 �ƴ� Ŭ�������� ������ �Ұ���(����ȯ �Ұ�)
		
		f= new FireEngine();
		
		Car car = f; // ��Ӱ��谡 �ִ� ��Ȳ ����ȯ ���� upcasting(����ȯ ��ŵ ����)
		
		FireEngine f2;
		f2 = (FireEngine) car; // downcasting(����ȯ ���� �Ұ���)
		
		
		f2.water();		
	}
}
