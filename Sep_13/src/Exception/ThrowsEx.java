package Exception;

public class ThrowsEx {
//main���� throws ClassNotFoundException : jvm���� �������� �ǹ� => ȭ�� ���
	public static void main(String[] args)/*throws ClassNotFoundException*/ {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}
	
	//throws :  ���⼭ �߻��� ���ܸ� �� �޼ҵ带 ȣ���ϴ� ������ ��������
	public static void findClass() throws ClassNotFoundException {
		Class.forName("");
	}

}
