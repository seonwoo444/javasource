package sep_16;

import java.util.HashSet;
import java.util.Set;

public class SetEx2 {
	public static void main(String[] args) {
		//�ζ� ��ȣ ����
		Set<Integer> set = new HashSet();
		
		while (set.size()<6) {
			int lotto = (int) (Math.random()*45)+1;
			set.add(lotto);
		}
		System.out.println(set);
	}
}
