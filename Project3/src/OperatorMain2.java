import java.util.Scanner;

public class OperatorMain2 {
	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);

		System.out.print("Ű : ");

		double height = k.nextDouble();

		System.out.print("���� : ");
		
		int age = k.nextInt();
		System.out.println("----------");

		System.out.printf("Ű %.1fcm, ���� %d��\n", height, age);

		// > (�ʰ�), >=(�̻�), ==(����-equer), !=(�ٸ���), <= , <
		// Ű�� 150�� �ѳ�
		boolean a = height > 150;
		System.out.println(a);

		// ���̰� 10�� ����
		boolean b = (age <= 10); // () - �켱�� �Ǵ� ���꿡 �ᵵ �ǰ� �Ƚᵵ �ȴ�.
		System.out.println(b);

		// �����տ����� :  ~��, and... -> &&
		// 				~�ų�, or... -> ||
		//				�ݴ�, / not -> !
		
		// ���̰� 5�� �̻��̰�, Ű�� 200cm �̻��ΰ�
		boolean c = (age >= 5) && (height >= 200);
		System.out.println(c);
		// Ű�� 200cm �̻��̰ų�, ���̰� 5�� �̻��ΰ�
		boolean d = (height >= 200) || (age >= 5);
		System.out.println(d);
		
		// d�� true�� e�� false
		// d�� false�� e�� true
		boolean e = !d;
		System.out.println(e);
				
	}
}
