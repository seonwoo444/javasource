package systemclass;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {

	public static void main(String[] args) {
		//hashCode()/equals() => �Ѵ� ���ٸ� �������� ����
		Set<Member> set = new HashSet();
		set.add(new Member("hong123", "hong123", "ȫ�浿"));
		set.add(new Member("hong124", "hong123", "ȫ�浿"));
		set.add(new Member("hong125", "hong123", "ȫ�浿"));
		set.add(new Member("hong123", "hong123", "ȫ�浿"));
		
		for (Member mb : set) {
			
			System.out.println(mb+" "+mb.hashCode());
		}
		

	}

}
