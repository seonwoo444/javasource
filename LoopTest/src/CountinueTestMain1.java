//continue; �ݺ����ȿ��� ���Ǹ�, ��� ������ continue ���� ����Ǹ� for���� ������, while ���ǽ����� �̵�
public class CountinueTestMain1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i %2 == 0) {
				continue; // ���� ���� �κ�
			}// ���ǿ� �����ϸ� syso�� ���ϰ� for������ ���ư� �ٽ� ����
			// �Ҹ��� �� ���
			System.out.println(i);
		}

	}

}
