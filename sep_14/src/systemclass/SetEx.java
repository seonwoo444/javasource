package systemclass;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* Set : �ߺ��� ������� ����, ������ ����
 * 		: ���� Ŭ���� - HashSet, TreeSet
 */ 
public class SetEx {

	public static void main(String[] args) {
		
		Collection<String> collection;
		list
		
		Set<String> set1 = new HashSet();
		HashSet<String> set2 = new HashSet();
		
		set1.add("java");
		set1.add("jsp");
		set1.add("oracle");
		set1.add("html");
		
		System.out.println(set1);
		
		System.out.println();
		
		for (String str : set1) {
			System.out.println(str);
		}
		System.out.println();
		
		set2.add("1");
		set2.add("2");
		set2.add("3");
		set2.add("4");
		set2.add("1");//�ߺ����� ���� ����
		
		System.out.println(set2);
		
	}

}
