package Exception;

//Exception(���ܻ���)
//CheckedException : comile �� ��Ÿ���� ����
//UnCheckedException : run Ÿ�� �� ��Ÿ���� ����

public class CheckedException {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
