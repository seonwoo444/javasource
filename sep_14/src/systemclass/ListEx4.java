package systemclass;

import java.util.LinkedList;
import java.util.List;

/* ArrayList vs LinkedList
 * LinkedList�� ���� ����
 * ���������� �߰�/���� �ϴ� ��� ArrayList�� �� ȿ���� => ũ�� ��Ƴ��°� �߿�
 * �߰� �����͸� �߰�/���� �� LinkedList�� �� ȿ��
 *  
 */


public class ListEx4 {

	public static void main(String[] args) {
		List<String> list = new LinkedList();
		
		//�߰�
		list.add("���");
		list.add("����");
		list.add("�ٳ���");
		list.add("��");
		list.add("����");
		
		System.out.println(list);
		
		

	}

}
