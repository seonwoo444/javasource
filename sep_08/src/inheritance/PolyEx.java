package inheritance;

public class PolyEx {

	public static void main(String[] args) {
		parent2 p2 = new Child3();// 생성을 자식으로
		
		p2.field1 = "";
		p2.method1();
		p2.method2();
		
		//method3 실행
		Child3 c = (Child3) p2;
		c.method3();
		
		parent2 obj = new parent2();// 생성을 부모로
		Child3 c2 = (Child3) obj;
		c2.method3();
	}

}
