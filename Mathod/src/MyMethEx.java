
public class MyMethEx {

	public static void main(String[] args) {
		// static �޼ҵ�(Ŭ���� �޼ҵ�)ȣ�� => ��ü ���� ���� ȣ��
		// longŸ���� ���� �� l, L�� �پ�� �Ѵ�
		System.out.println(MyMeth.add(394l, 248l));
		System.out.println(MyMeth.divide(233.0, 564.0));
		System.out.println(MyMeth.multiply(214l, 567l));
		System.out.println(MyMeth.subtract(123l, 213l));

		System.out.println();
		
		// ����޼ҵ� ȣ��
		MyMeth mymeth = new MyMeth();

		mymeth.x = 200;
		mymeth.y = 200;

		System.out.println(mymeth.add());
		System.out.println(mymeth.divide());
		System.out.println(mymeth.multiply());
		System.out.println(mymeth.subtract());
	}

}
