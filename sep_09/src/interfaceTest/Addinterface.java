package interfaceTest;

/* 1) 상수 필드만 가짐
 * 2) 매소드는 무조건 추상 매소드로(abstract 안 붙여도 인식)
 * 3) static메소드와 default메소드만 들어올 수 있다(나머지 추상 메소드)
 */


public interface Addinterface {

	public static final int X = 100;
	
	void method1();

	
	//1.8부터
	// static 매소드와 default 메소드 들어올 수 있음
	static void method2() {
		
	}
	default void method3() {
		
	}
		
}
