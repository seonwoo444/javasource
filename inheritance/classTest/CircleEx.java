package classTest;

public class CircleEx {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.radius = 5;
		System.out.println("���� ���� : "+circle.getArea());
		
		
		Circle circle2 = new Circle();
		circle2.radius = 4.5;
		System.out.println("���� ���� : "+circle2.getArea());

	}

}
