package interfaceTest;

/* 1) ��� �ʵ常 ����
 * 2) �żҵ�� ������ �߻� �żҵ��(abstract �� �ٿ��� �ν�)
 * 3) static�޼ҵ�� default�޼ҵ常 ���� �� �ִ�(������ �߻� �޼ҵ�)
 */


public interface Addinterface {

	public static final int X = 100;
	
	void method1();

	
	//1.8����
	// static �żҵ�� default �޼ҵ� ���� �� ����
	static void method2() {
		
	}
	default void method3() {
		
	}
		
}
