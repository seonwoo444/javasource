package test;

// continue; �ݺ����ȿ��� ���Ǹ�, ��� ������ continue ����
// ����Ǹ� for���� ������, while ���ǽ����� �̵�

public class ContinueTest1 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
