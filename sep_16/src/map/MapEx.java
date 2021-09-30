package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap();// k key v value�� ������ Ÿ��

		// ��� �߰� : .put Ű ��
		map.put("id_0123", "ȫ�浿");
		map.put("id_0124", "��浿");
		map.put("id_0125", "�ֱ浿");
		map.put("id_0126", "�ڱ浿");

		// ��������
		System.out.println("Ű�� �ش��ϴ� �� �������� : " + map.get("id_0124"));
		System.out.println("Ű�� �����ϴ��� Ȯ���ϱ� : " + map.containsKey("id_0125"));
		System.out.println("���� �����ϴ��� Ȯ���ϱ� : " + map.containsValue("ȫ�浿"));
		System.out.println("�ʿ� ũ�� : " + map.size());
		System.out.println("�� ��� ���� : " + map.remove("id_0126"));
		
		//Ű ���� ��� ��������
		Set<String> key = map.keySet();
		System.out.println(key);
		
		//���� ��������
		Collection<String> values = map.values();
		System.out.println(values);
		
		

	}

}
