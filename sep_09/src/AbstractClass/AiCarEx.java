package AbstractClass;

public class AiCarEx {

	public static void main(String[] args) {
		AiCar aicar = new AiCar("black");
		
		aicar.start();
		aicar.drive();
		aicar.stop();
		
		//추상클래스는 객체 생성이 불가능
		//		Car car = new Car();
		Car car = new AiCar("white");
		car.start();
		car.drive();
		car.stop();
	}

}
