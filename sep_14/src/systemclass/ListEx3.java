package systemclass;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
		List<Member> list = new ArrayList();
		
		//�߰�
		list.add(new Member("hoog1", "lse1234", "ȫ�浿"));
		list.add(new Member("hoog2", "lse1432", "��ȫ��"));
		list.add(new Member("hoog3", "lse1543", "�ڱ濵"));
		list.add(new Member("hoog4", "lse1784", "�ּ���"));
		list.add(new Member("hoog5", "lse1453", "�̼���"));
		
		//��������
		System.out.println(list);//��Ű����.Ŭ������ �ּ�
		
		System.out.println();
		
		for (Member mem : list) {
			System.out.println(mem);
		}

	}

}
