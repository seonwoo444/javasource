package abstractTest;

public class AiCar extends Car {

	public AiCar(String color) {
		super(color);		
	}

	@Override
	void drive() {
		System.out.println("��������");

	}

	@Override
	void stop() {
		System.out.println("�ڵ����� ����");

	}

}
