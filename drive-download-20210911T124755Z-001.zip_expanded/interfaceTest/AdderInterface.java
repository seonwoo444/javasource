package interfaceTest;

/* 1) ��� �ʵ常 ����
 * 2) �߻� �޼ҵ常 ���� 
 */
public interface AdderInterface {
	// interface field AdderInterface.x; only public, static & final are permitted
	public static final int X = 100;
	
	// Abstract methods do not specify a body
	void method1();
	
	// 1.8 ����
	// static�޼ҵ�� default �޼ҵ� ���� �� ����
	static void method2() {
		
	}
	default void method3() {
		
	}
}












