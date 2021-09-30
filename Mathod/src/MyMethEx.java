
public class MyMethEx {

	public static void main(String[] args) {
		// static 메소드(클레스 메소드)호출 => 객체 생성 없이 호출
		// long타입은 숫자 뒤 l, L이 붙어야 한다
		System.out.println(MyMeth.add(394l, 248l));
		System.out.println(MyMeth.divide(233.0, 564.0));
		System.out.println(MyMeth.multiply(214l, 567l));
		System.out.println(MyMeth.subtract(123l, 213l));

		System.out.println();
		
		// 멤버메소드 호출
		MyMeth mymeth = new MyMeth();

		mymeth.x = 200;
		mymeth.y = 200;

		System.out.println(mymeth.add());
		System.out.println(mymeth.divide());
		System.out.println(mymeth.multiply());
		System.out.println(mymeth.subtract());
	}

}
