package exception;

public class ThrowsEx {
	// main ���� throws �� �ǹ� : jvm ���� �������� �ǹ� => ȭ�� ���
	public static void main(String[] args) /*throws ClassNotFoundException */ {	
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}

	}
	
	// throws : ���⼭ �߻��� ���ܸ� �� �޼ҵ带 ȣ���ϴ� ������ ��������
	public static void findClass() throws ClassNotFoundException {
		Class.forName("");
	}
}
