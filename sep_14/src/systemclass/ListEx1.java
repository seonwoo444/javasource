package systemclass;

/* �÷��� �����ӿ�ũ
 * ���������͵��� �����ϴ� Ŭ�������� ǥ��ȭ�� ����
 * (interface)Collection - List, Set
 * (interface)Map
 * 
 * (����Ų �迭�� ���ٰ� ��������)
 * List(�������̽�) : ������ �ִ�. �������� �ߺ� ����
 * 		���� Ŭ���� : Vector, ArrayList, LinkedList, Stack.....
 * E, T, K, V: ���� ��ü Ÿ���� ����
 * 
 * �⺻ Ÿ�� => ��ü Ÿ��(wrapper Ŭ����)
 * int => Integer, float => Float, double => Double, char => Character, boolean => Boolean
 */

public class ListEx1 {

	public static void main(String[] args) {
		//��ü ����
		List<String> List = new ArrayList<String>();
		ArrayList<Integer> List2 = new ArrayList<Integer>();

		//������ �߰� => add
		List1.add("���");
		List1.add("����");
		List1.add("�ٳ���");
		List1.add("��");
		List1.add("����");
		
		//������ ��������
		for (String str : List1) {
			System.out.println(str);
		}
		System.out.println();
		
		System.out.println(List1); // toString() �������̵� �Ǿ��ֵ�
		
		for (int i = 0; i < List1.size(); i++) {
			System.out.println(List1.get(i));
		}
	}
	
	List2.add(10);
	List2.add(20);
	List2.add(30);
	List2.add(40);
	List2.add(50);
	List2.add(60);
	
	for (Integer i : List2) {
		System.out.println(i);
	}
	//�հ� ���ϱ�
	int sum = 0;
	for(int i = 0; i < List2.size(); i++) {
		sum += i;
	}
	System.out.println("�հ�"+sum);
}
}
