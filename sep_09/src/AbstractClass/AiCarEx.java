package AbstractClass;

public class AiCarEx {

	public static void main(String[] args) {
		AiCar aicar = new AiCar("black");
		
		aicar.start();
		aicar.drive();
		aicar.stop();
		
		//�߻�Ŭ������ ��ü ������ �Ұ���
		//		Car car = new Car();
		Car car = new AiCar("white");
		car.start();
		car.drive();
		car.stop();
	}

}
