package Exception;

public class CatchByException {

	public static void main(String[] args) {

		
		try {
			//ArrayIndexOutOfBoundsException
			String data1 = args[0];
			String data2 = args[1];
			//numberFormatException
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			System.out.println(value1 + value2);
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("�Է°��̳� ���ڷ� ��ȯ�� �� ���� �����ֽ��ϴ�.");
		}catch (Exception e) {
			System.out.println("�˼� ���� ���� �߻�.");
		}finally {//exception ���ο� ������� ������ ����
			System.out.println("�ٽ� �����ϼ���.");
		}

	}

}